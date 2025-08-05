#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(int n, vector<string> words) {
    vector<int> answer; 
    
    for(int i=0; i<words.size(); i++)
    {
        if(i==0) continue;
        if(words[i-1].back() != words[i].front())
        {
            answer.insert(answer.begin(),i%n+1);
            answer.insert(answer.begin()+1,i/n+1);
            return answer;
        }
        else
        {
            auto it = find(words.begin(), words.begin()+i, words[i]);
            if(it!=words.begin()+i)
            {
                std::cout <<  i << std::endl;
                answer.insert(answer.begin(),i%n+1);
                answer.insert(answer.begin()+1,i/n+1);
                return answer;
            }
        }
        
        if(i==words.size()-1)
        {
            answer.insert(answer.begin(),0);
            answer.insert(answer.begin()+1,0);
            return answer;
        }
    }

    return answer;
}