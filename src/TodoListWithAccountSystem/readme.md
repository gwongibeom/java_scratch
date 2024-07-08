# 계정 기반 투두리스트

`개발 중 추가 사항이 많아져 코드 내용과 조금 다릅니다.`

## 간단 플로우
1. (실행) 사용자 로그인, 회원가입 메뉴 표기 후 사용자가 입력
   2. 사용자가 로그인 성공시 다음 단계로
   3. 사용자가 회원가입시 회원가입 후 다시 로그인으로
2. (로그인 후) 현재 투두리스트 출력 및 메뉴 표시
   3. 추가 클릭시 : 추가 플로우 실행 후 다시 2번으로
   4. 삭제 클릭시 : 삭제 플로우 실행 후 2번으로
   5. 로그아웃 클릭시 : 1번으로

## 메뉴들

### 계정
1. 로그인(맨처음켰을때와 로그아웃할 때)
2. 회원가입(맨처음켰을때와 로그아웃할 때)
3. 로그아웃(로그인 후)

### todolist
1. 추가
2. 삭제

## 클래스

### Todo
#### 변수
1. id(String)
2. 타이틀(String)
3. 어카운트 아이디(String)

#### 메소드
1. 생성자(id, title, accountId)
2. 게터 3종

### TodoListSystem
#### 변수
1. 투두 리스트(Todo[])

### 메소드
1. 투두 리스트 추가(void)
2. 계정별 투두리스트 불러오기(Account[])
3. 투두리스트 삭제(para-int id)(void)


### Account
#### 변수
1. 어카운트 아이디(String)
2. 어카운트 비밀번호(String)

#### 메소드
1. 생성자(String id, password)
2. 로그인(String id, password)
3. id게터
4. password게터


### AccountSystem
#### 변수
1. 어카운트 리스트(db 역할)(Account[])
2. 현재 로그인(기본값 null)(Account)

#### 메소드
1. 어카운트 추가(void)
2. 로그인(para-id(String),password(String))(void)
3. 로그아웃(para-id(String),password(String))(void)
4. 현재 로그인 유저 getter


### InputHandler
#### 메소드
1. getStringInput(para-type(String))(String)

### ConsoleTools
#### 메소드
1. clear(void)

### Main
#### 플로우
1. AccountSystem 객체 생성
2. TodoListSystem 객체 생성
3. 무한반복 ↓
   4. 로그인 하였는지 AccountSystem 현재로그인값 확인
   5. 로그인 안했을때
      6. 로그인 회원가입 메뉴표시
      7. 로그인 OR 회원가입 진행
   6. 로그인 되어있을때
      7. TodoListSystem 메뉴, 로그아웃 표시
      8. 기능 별 플로우 실시