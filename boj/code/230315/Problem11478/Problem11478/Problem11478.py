## beakjoon Problem11478
## input: string, len <= 1000
## output: �κй��ڿ� �� �ٸ� ���� �� 
## 2023-03-15

inStr = input()

checkDic = {}
for i in range(len(inStr)):
    for j in range(0, len(inStr)-i):
        checkDic[inStr[j:j+i+1]] = 1

print(len(checkDic))