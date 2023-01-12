#String배열

###String 배열의 선언과 생성 초기화
```
String[] name = new String[3];

String[] name = {"Kim", "Park", "Lee"} //초기화 new String[] 생략 가능
```

String타입의 참조변수를 저장하기 위한 공간이 마련되고 참조형 변수의 기본값은 null
이므로 각 요소의 값은 null로 초기화됨

```
변수의 타입에 따른 기본값
boolean --- false
char --- 'u\0000'
byte,short,int --- 0
long --- 0L
float --- 0.0f
double --- 0.0d or 0.0
참조형 변수 --- null
```
String클래스의 주요 메서드
```
char charAt(int index) -> 문자열에서 해당index에 있는 문자 반환
int length() -> 문자열의 길이를 반환
String substring (int from, int to) -> 문자열에서 해당 범위(from~to)에 있는 문자열을 반환.(to는 범위에 포함되지 않음)
boolean equals(Object obj) -> 문자열의 내용이 obj와 같은지 확인한다. 같으면 결과는 true, 다르면 false 반환
char[] toCharArray() -> 문자열을 문자배열(char[])로 변환해서 반환
```





