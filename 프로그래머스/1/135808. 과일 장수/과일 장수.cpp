#include <string>
#include <vector>
#include <algorithm> 

using namespace std;

int solution(int k, int m, vector<int> score) {
    int answer = 0;
    
    sort(score.rbegin(), score.rend()); //내림차순 정렬
    
    for(int i=0; i<score.size(); i++)
    {
        if(i%m ==m-1)
        {
            answer +=score[i];
        }
    }
    
    answer *=m;
    
    return answer;
}