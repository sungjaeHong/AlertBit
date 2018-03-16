//TODO  
- 거래소(바이낸스 비트파이넥스 등 유명 거래소) API 추가  
- 거래소 API 파싱하는 공통 모델 정의  
```$xslt
Single Model Response Format
{
    "data": {
        Data Object
    },
    "success": true, // or false
    "error": null // or Error model
}
  
List Model Response Format
{
    "data": [
        {
            Data Object
        }
    ],
    "success": true, // or false
    "error": null, // or Error model
    "last": false,
    "totalElements": 20,
    "totalPages": 4,
    "size": 5,
    "number": 0,
    "sort": null,
    "first": true,
    "numberOfElements": 5
}
  
Error Model
{
    "httpStatus": HttpStatus,
    "message": "message",
    "detailMessage": "more detail messages"
}

```
  
- 공통된 모듈로 거래소별 가격 DIFF  
- angular 이용하여 프론트 엔드 구축  
- 회원가입 기능  
- mms 모듈 연동하여 지정된 가격 도달시 문자발송 or push  
