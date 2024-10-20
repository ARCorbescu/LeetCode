#include <vector>

using namespace std;

class Solution {
public:
    bool canJump(vector<int>& nums) {

        int max_reach = 0;
        bool output = false;

        for(int i = 0; i < nums.size(); i++){
            if(i > max_reach)
                output = false;
            else
                max_reach = max(max_reach, i + nums[i]);
            if(max_reach >= nums.size()-1)
                output = true;
                break;
        }
        return output;
    }
};