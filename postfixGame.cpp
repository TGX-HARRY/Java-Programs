#include <bits/stdc++.h>
using namespace std;

class SOLUTION {
    public: 
    string infixToPostfix(string s) {
        stack<char> stk;
        string postfix = "";
        for(int i=0;i<s.length();i++) {
            char c = s[i];
            if (isdigit(c) || isalpha(c)) {
                postfix += c;
            }
            else if (c == '(') {
                stk.push(c);
            }
            else if (c == ')') {
                while (stk.top() != '(') {
                    postfix += stk.top();
                    stk.pop();
                }
                stk.pop(); // removes the ( bracket
            }
            else {
                while
            }
        }
    }

    string evaluatePostfix(string s) {
        stack<int> stk;
        for(int i=0;i<s.length();i++) {
            char ch = s[i];
            if (isdigit(ch)) {
                stk.push(ch-48);
            }
            else {
                int y = stk.top();
                stk.pop();
                int x = stk.top();
                stk.pop();
                switch (ch) {
                    case '+':
                        stk.push(x+y);
                        break;
                    case '-':
                        stk.push(x - y);
                        break;
                    case '*':
                        stk.push(x * y);
                        break;
                    case '/':
                        stk.push(x / y);
                        break;
                    default:
                        return "";
                        break;
                    }
            }
        }
    }
};