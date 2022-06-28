#include <iostream>
#include <vector>
using namespace std;
// 그룹단어 체커
// 단어 갯수 : N
// 단어 : 소문자, 중복 X, 길이 최대 100
// 그룹단어 : 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
// 목표 : 그룹단어 갯수 출력
// 방법 
// 1. 받은 문자열을 순차적으로 검색해서 일단 먼저 들어온 값이랑 같은지 확인(첫 문자는 바로 배열에 넣고 시작)
// 2. 이전문자랑 같으면 넘어가기
// 3. 새로 나온 문자라면 배열에서 먼저 나왔었는지 확인 후 없었다면 배열에 넣어주기, 있었다면 단어 넘기기
// 4. 단어 전체를 검색했을때 마지막까지 온다면 카운트 올려주기
int main()
{
    int cnt = 0, N = 0;
    vector<string> vec;
    string s;
    cin >> N;
    for (int i = 0; i < N; i++) 
    {
        vector<char> vecChar;
        bool isChek = true;
        cin >> s;
        for (int j = 0; j < s.size(); j++) 
        {
            if(j == 0 )
            {
                vecChar.push_back(s[j]);
            }
            else
            {
                if (s[j] != s[j - 1])
                {
                    for (char c : vecChar)
                    {
                        if (c == s[j])
                        {
                            isChek = false;
                            break;
                        }
                    }
                    vecChar.push_back(s[j]);
                }
            }            
        }
        if(isChek)
            cnt++;
    }

    std::cout << cnt;
}