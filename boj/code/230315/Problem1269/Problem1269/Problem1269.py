## baekjoon Problem1269
## input: �ڿ����� ���Ҹ� ������ �� ���� A, B
## output: ��Ī �������� ������ ����
## 2023-03-15

setANumber, setBNumber = map(int, input().split())
setA = list(map(int, input().split()))
setB = list(map(int, input().split()))

setADict = {setA[i]: 0 for i in range(setANumber)}
setBDict = {setB[i]: 0 for i in range(setBNumber)}

cnt = 0
for i in range(setANumber):
    if setA[i] in setBDict:
        cnt += 1
result = len(setA) - cnt

cnt = 0
for i in range(setBNumber):
    if setB[i] in setADict:
        cnt += 1
result = result + len(setB) - cnt

print(result)