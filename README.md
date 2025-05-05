# 🌲 경주의 밤 - Backend

[![Contributors](https://img.shields.io/badge/contributors-4-brightgreen)](#-기여자-)  

![image](https://github.com/user-attachments/assets/f48060f1-04e1-4631-a00b-a309f9c33cbd)



'경주의 밤'은 경주 지역 경제 활성화를 목표로 기획된 통합 플랫폼입니다. 
전국 단위 숙박 플랫폼이 넘치는 시대에 경주만의 독특한 매력을 집중적으로 살리는 서비스로, 숙박 예약과 지역 특산품 연계, 그리고 SNS 기반의 오프라인 이벤트 참여 기능을 제공합니다.

2024 경주 해커톤에서 최우수상을 받은 작품으로, 참가팀 중 유일하게 전체 기능의 90% 이상을 구현해, 가장 완성도 높은 결과물을 도출했습니다.

---

## 🧑‍💻 기여자  
| 이름      | Github 프로필     | 역할            |  
|-----------|------------------|-----------------|  
| 권민지     | [mjgwon24](https://github.com/mjgwon24) | frontend & backend & design |
| 김이현     | [lh7721004](https://github.com/lh7721004) | frontend & backend |  
| 전상은     | [wowddok99](https://github.com/wowddok99) | frontend & backend |  
| 전형주     | [kavu-multi](https://github.com/kavu-multi) | AI/ML Engineer |  

---

## 🗓️ WBS
<img width="600" alt="image" src="https://github.com/user-attachments/assets/902bc4ed-5a3a-47fa-b470-2c17115bcc03" />

---

## 🛠️ 기술 스택  

-   **Backend**
    -   Spring Boot
    -   REST API
    -   JPA & JPQL
    -   MySQL
    -   Docker
-   **협업 및 테스트**
    -   Git
    -   Postman
    -   Figma
---

## 👩‍💻 Backend 주요 기능  

### **게시글 등록/조회 & 댓글 등록/조회 & 이미지 첨부 API**
- SNS event를 인증 게시판을 통해 인증하고, 작성 글 조회 및 댓글 등록을 할 수 있습니다.
- 견적톡 게시판을 통해 여행 견적을 문의할 수 있습니다.
<img width="429" alt="image" src="https://github.com/user-attachments/assets/d13f05cb-44bf-4f73-82f6-8385326b84bd" />

<img width="429" alt="image" src="https://github.com/user-attachments/assets/f1fd4e06-67ac-403f-ab1f-83ad23077594" />

<img width="429" alt="image" src="https://github.com/user-attachments/assets/aba3c36e-e35a-4bc2-93ab-ba8bbf5e45db" />
<img width="429" alt="image" src="https://github.com/user-attachments/assets/90936da2-4c37-45d9-9877-7d26ba54a6c3" />


### **예약 등록/조회 & 본인 확인 API**
- 숙소/캠핑 list에서 원하는 숙소 및 캠핑장을 조회하고, 기간과 입실 날짜를 선택 후 예약할 수 있습니다.
- 전화번호를 활용하여 본인이 예약한 목록을 확인할 수 있습니다.

<img width="429" alt="image" src="https://github.com/user-attachments/assets/706ef5df-353c-400d-bec4-9581dba50499" />

<img width="429" alt="image" src="https://github.com/user-attachments/assets/9718af7e-aa66-44d6-9cc5-ddbdb2dc57a7" />

<img width="429" alt="image" src="https://github.com/user-attachments/assets/a96aadaf-8166-4f5d-af50-4546fa67100e" />

<img width="429" alt="image" src="https://github.com/user-attachments/assets/e6019e48-c8b8-463c-a5dd-61a121d9a005" />


### **식사 메뉴 추천 모듈**
- 딥러닝 모델을 통해 질문 기반 분석을 진행하여 사용자의 입맛에 추천할 만한 식사 메뉴를 추천해줍니다.

<img width="600" alt="image" src="https://github.com/user-attachments/assets/41dc87b8-0b76-430d-82cb-cb24b932e858" />

<img width="600" alt="image" src="https://github.com/user-attachments/assets/7c03f4e5-7a87-4a17-9581-114390a2f181" />

<img width="600" alt="image" src="https://github.com/user-attachments/assets/eafbee17-b50b-40e6-9f91-fd34f3f09c65" />

---

## 📁 프로젝트 구조  

```
tour-recommend-back
├── src/main/java/
│ ├── tour_recommend/tour_recommend_back/
│ ├── api/
│ ├── config/
│ ├── dto/
│ ├── entity/
│ ├── repository/
│ └── service/
├── src/main/resources/
│ └── application.yml
├── build.gradle
├── settings.gradle
├── docker-compose.yml
└── .gitignore
```  

---

## 📬 프로젝트 후기

### 🍒 권민지

모든 팀원들의 노력으로 해커톤에서 "최우수상"이라는 값진 결과를 얻을 수 있어 정말 기뻤습니다.<br/>
프로젝트를 진행하면서 가장 보람찼던 순간은 사용자 인터페이스와 추천 시스템이 실제로 잘 작동하는 모습을 확인했을 때였습니다.<br/>
팀원들과 함께 잠도 자지않고 고민하며 최적화한 AI 알고리즘이 사용자의 취향에 맞는 저녁 메뉴를 추천하는 장면을 볼 때, 그간의 노력이 헛되지 않았음을 느꼈습니다.<br/>
또한 제한된 시간 안에 기능 구현과 디자인 완성도를 동시에 높이는 것이 쉽지 않았지만, 팀워크를 통해 이를 해냈다는 점도 큰 자부심으로 남습니다.<br/>
이 프로젝트를 통해 경주의 지역 활성화에 조금이나마 기여를 했다고 생각하니 뿌듯합니다.<br/>
더 나아가, 이런 경험들이 기반이 되어 앞으로도 지역 문제 해결을 위한 다양한 프로젝트에 도전할 수 있기를 기대합니다.<br/>
해커톤 프로젝트를 함께해준 모든 팀원분들께 진심으로 감사드립니다😊

<br/>

### 🍯 김이현

해커톤 팀이 꾸려졌을 때 정말 잘 하시는 분들과 팀이 결성되어 감사함과 기대감을 느낌과 동시에 제가 이 팀에서 잘 해낼 수 있을 지에 대해 걱정도 되었습니다.<br/>
하지만 선배분들이 저를 믿고 저에게 일을 맡겨주셔서 책임감을 가지고 열심히 할 수 있었습니다.<br/>
해커톤을 준비하고 진행하는 과정에서 실수도 많이 하고 부족함도 많았지만 그럼에도 불구하고 잘 이끌어나가 주셔서 정말 감사했습니다!<br/>
이번 대회를 통해서 Springboot의 entity, dto, React의 ReactQuery를 사용하면서 이전에 조금씩은 사용해봤던 Springboot와 React에 대해서 더 많은 것을 배워갈 수 있었습니다.<br/>
Git 실수도 많이 해서 충돌이 발생하는 일도 있었지만 그럴 때마다 바쁜 와중에도 민지 선배님께서 잘 알려주셔서 해결할 수 있었습니다.<br/>
그리고 발표를 할 때 많이 떨렸지만 팀원분들이 잘 다독여줘서 정말 도움이 많이 됐고 감사했습니다.<br/>
프로젝트를 하면서 부족함을 많이 느낄 수 있었고 개선해나갈 방향을 잡을 수 있었던 좋은 분들과 했던 좋은 프로젝트였습니다!<br/>
다들 정말 고생 많이 하셨고 많은 도움 주셔서 감사합니다!

<br/>

### 🧑‍💻 전상은

이번 팀 프로젝트는 기획부터 개발, 시연, 그리고 발표 준비까지 모든 과정을 팀원들과 협력하며 진행한 값진 경험이었습니다.<br/>
초기에는 프로젝트의 방향성과 목표를 설정하고, 필요한 기술 스택과 작업 방식을 팀원들과 논의해 결정했습니다.<br/>
작업 방식과 코드 컨벤션을 정하는 과정에서는 서로의 의견을 조율하며 협업을 위한 공통의 기준을 세웠습니다.<br/>
개발 단계에서는 역할을 분담하고 주기적으로 진행 상황을 공유하며, 모든 팀원이 효율적인 작업 환경을 유지하기 위해 노력했습니다.<br/>
이번 해커톤 프로젝트를 통해 기술적인 성장뿐만 아니라 협업의 중요성을 다시 한번 느낄 수 있었습니다.<br/>
팀원들과의 대화를 통해 체계적으로 좋은 결과를 만들어갈 수 있었던 점이 특히 기억에 남습니다.<br/>
2024년의 마지막을 이 해커톤으로 의미 있게 마무리할 수 있었으며, 함께해주신 조원들 모두 고생 많으셨습니다. 진심으로 감사드립니다! 😊

<br/>

### 🥥 전형주

단순히 학과공부나 개인공부로 매너리즘에 빠진 제게 정말 큰 도움이었던 것 같습니다.<br/>
주제를 통해 체계적으로 기획, 팀 협업을 해본 것도 처음이었고, 팀원들 덕분에 관심분야 이외에 다른 지식들을 배워갈 수 있었던 기회였습니다.<br/>
나와 다른 분야에서 어떤 고민을 하고, 어떤식으로 기획을 개발에 녹여내는지 보면서 나는 어떤 분야와 개발을 지향하는지 다시금 고민해보는 시간이었습니다.<br/>
이 기회를 발판으로 새로운 영역에 발을 딛는 것에 더욱 용기를 가질 수 있게 되었습니다.<br/>
무엇보다 다들 밤을 새워가면서도 서로 다독여주는 팀원들에게 너무나도 감사드리구 수고하셨습니다!!!<br/>

<br/>

---
![image](https://github.com/user-attachments/assets/f46c82e4-6f81-4000-b47e-96f9b70de61a)

