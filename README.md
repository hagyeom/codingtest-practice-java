# 📘 BOJ + Programmers Algorithm Log

> 백엔드 개발자 취업을 목표로,  
> 백준과 프로그래머스에서 문제를 풀고 기록으로 남깁니다.  
> 하루 한 문제 이상 꾸준히 풀이하며 로직 감각을 길러가는 중입니다.

---

## 📌 사용 언어

- Language: `Java 17`
- IDE: IntelliJ IDEA
- 플랫폼: [백준](https://www.acmicpc.net/) + [프로그래머스](https://school.programmers.co.kr/)

---

## 📚 커리큘럼 요약

| 단계 | 주제 |
|------|------|
| 1단계 | 문자열 기초 |
| 2단계 | 자료구조 (스택, 큐, 힙) |
| 3단계 | 문자열 응용 |
| 4단계 | DFS / BFS |
| 5단계 | 그리디 |
| 6단계 | 정렬 & 해시 |
| 7단계 | 문자열 심화 |
| 8단계 | 다이나믹 프로그래밍 |
| 9단계 | 트리 & 트리 DP |

---

✅ 백엔드 & 실전 코딩 테스트 대비 커리큘럼 (백준 + 프로그래머스 대응)

🔰 [1단계] 문자열 기본기 대응 문제

| 백준 문제        | 프로그래머스 문제    | 설명                      |
| ------------ | ------------ | ----------------------- |
| 11654 아스키 코드 | 문자열을 정수로 바꾸기 | char, int, 형변환 기초       |
| 11720 숫자의 합  | 자릿수 더하기      | 숫자 자릿수 순회하며 합           |
| 10809 알파벳 찾기 | 가장 가까운 같은 글자 | 문자 위치 기록/비교             |
| 2675 문자열 반복  | 문자열 다루기 기본   | 문자열 형식 체크/변환            |
| 1152 단어의 개수  | 공백으로 구분하기    | split(" "), 빈 문자열 처리 주의 |

🧱 [2단계] 자료구조 기초 (스택, 큐, 힙)

| 백준 문제       | 프로그래머스 문제 | 설명               |
| ----------- | --------- | ---------------- |
| 10828 스택    | 올바른 괄호    | 스택 기초, 괄호 짝 맞추기  |
| 18258 큐 2   | 기능개발      | 큐 구조 + 진도처리 시뮬   |
| 10866 덱     | 프린터       | 큐/우선순위 시뮬레이션     |
| 11279 최대 힙  | 더 맵게      | PriorityQueue 활용 |
| 11286 절댓값 힙 | 이중우선순위큐   | 힙 두 개 운용, 삭제처리까지 |


📚 [3단계] 문자열 실전 문제

| 백준 문제          | 프로그래머스 문제       | 설명               |
| -------------- | --------------- | ---------------- |
| 2908 상수        | 숫자 문자열과 영단어     | 문자열 조작 & 조건 처리   |
| 5622 다이얼       | 다트 게임           | 문자 하나씩 분석해 조건 분기 |
| 2941 크로아티아 알파벳 | 비밀지도            | 문자열 치환/이진 조작     |
| 1316 그룹 단어 체커  | 신고 결과 받기        | 중복/조건 분기/Set 활용  |
| 1181 단어 정렬     | 문자열 내 마음대로 정렬하기 | 문자열 정렬 기준 커스터마이징 |


🔎 [4단계] 탐색 (DFS / BFS)

| 백준 문제           | 프로그래머스 문제   | 설명            |
| --------------- | ----------- | ------------- |
| 1260 DFS와 BFS   | 타겟 넘버       | DFS로 모든 경우 탐색 |
| 11724 연결 요소의 개수 | 네트워크        | 연결 컴포넌트 개수 세기 |
| 2178 미로 탐색      | 게임 맵 최단거리   | BFS로 최단 거리 탐색 |
| 2606 바이러스       | 전력망을 둘로 나누기 | DFS로 네트워크 분리  |
| 2667 단지번호붙이기    | 단어 변환       | BFS + 조건 제한   |


💡 [5단계] 그리디 알고리즘 추천 문제

| 백준 문제       | 프로그래머스 문제 | 설명              |
| ----------- | --------- | --------------- |
| 11047 동전 0  | -         | 가장 큰 단위부터 탐욕 선택 |
| 11399 ATM   | -         | 정렬 후 누적합 계산     |
| 1931 회의실 배정 | 호텔 대실     | 시간 정렬 + 겹침 처리   |
| -           | 체육복       | 조건 분기 & 분배      |
| -           | 조이스틱      | 최소 조작 횟수 그리디 탐색 |


🧠 [6단계] 정렬 & 해시

| 백준 문제           | 프로그래머스 문제             | 설명             |
| --------------- | --------------------- | -------------- |
| 2751 수 정렬하기 2   | K번째수                  | 정렬 & 슬라이싱      |
| 10989 수 정렬하기 3  | 최댓값과 최솟값              | split → 정렬     |
| 11650 좌표 정렬하기   | 정렬 (Comparator 직접 구현) | 이중 기준 정렬       |
| 11651 좌표 정렬하기 2 | 파일명 정렬                | 커스텀 정렬 조건 실습   |
| 10816 숫자 카드 2   | 폰켓몬                   | 중복 제거, HashSet |
| 1764 듣보잡        | 완주하지 못한 선수            | HashMap 사용     |
| 14425 문자열 집합    | 의상 종류 조합              | Map을 이용한 분류/조합 |


🌌 [7단계] 문자열 심화 문제

| 백준 문제             | 프로그래머스 문제 | 설명                        |
| ----------------- | --------- | ------------------------- |
| 1259 팰린드롬 수       | 팰린드롬 확인   | `StringBuilder.reverse()` |
| 10988 팰린드롬인지 확인하기 | 문자열 압축    | 패턴 반복 확인                  |
| 5052 전화번호 목록      | 전화번호 목록   | 접두사 판별, 정렬                |
| 12891 DNA 비밀번호    | 모음 사전     | 문자열 조합 탐색                 |
| 5430 AC           | 괄호 변환     | 조건 분기 & 시뮬레이션             |


🧠 [8단계] 다이나믹 프로그래밍 (DP)

🔹 DP 1단계 — 점화식 익히기

| 백준 문제          | 프로그래머스 문제 |
| -------------- | --------- |
| 1463 1로 만들기    | 멀리 뛰기     |
| 9095 1,2,3 더하기 | 피보나치 수    |
| 11726 2×n 타일링  | 계단 오르기    |

🔸 DP 2단계 — 조건 분기 + 누적 최적화

| 백준 문제       | 프로그래머스 문제 |
| ----------- | --------- |
| 2579 계단 오르기 | 정수 삼각형    |
| 1149 RGB거리  | N으로 표현    |
| 1932 정수 삼각형 | 동일 문제     |


🔹 DP 3단계 — 메모이제이션 & 고급 DP

| 백준 문제                 | 프로그래머스 문제    |
| --------------------- | ------------ |
| 9184 신나는 함수 실행        | -            |
| 2156 포도주 시식           | -            |
| 11053 가장 긴 증가하는 부분 수열 | 가장 큰 정사각형 찾기 |

🌳 [9단계] 트리 문제

🔹 트리 1단계 — 기본 순회 및 부모 찾기

| 백준 문제           | 프로그래머스 문제     |
| --------------- | ------------- |
| 11725 트리의 부모 찾기 | 길 찾기 게임       |
| 1991 트리 순회      | 모음 사전 (간접 연계) |
| 1068 트리         | -             |


🔸 트리 2단계 — DFS 기반 트리 구조 이해

| 백준 문제         | 프로그래머스 문제 |
| ------------- | --------- |
| 1967 트리의 지름   | -         |
| 2644 촌수계산     | 가장 먼 노드   |
| 1240 노드사이의 거리 | -         |


🔹 트리 3단계 — 트리 + DP 혼합

| 백준 문제             | 프로그래머스 문제 |
| ----------------- | --------- |
| 1949 우수 마을        | -         |
| 3584 가장 가까운 공통 조상 | -         |
| 2213 트리에서 독립집합    | -         |
