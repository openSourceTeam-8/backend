<div align="center">

# 🎬오픈소스SW개론 9조 영화 리뷰 플랫폼🎬
![Image](https://github.com/user-attachments/assets/00ba6e29-c492-4914-9f06-df0151570422)

</div> 

---
## 📝 소개
25-1학기 오픈소스SW개론 9조의 영화 리뷰 플랫폼을 소개합니다 !</br>
**영화 포스터와 함께 영화를 조회하고 해당 영화의 상세 정보까지** 확인할 수 있는 **영화리뷰플랫폼**입니다.
- 영화 시작 페이지 맨 위에 **랜덤으로 뜨는 영화**는 어떤지 확인해보세요!
- 포스터 위에 마우스를 호버시켜 **영화 요약 정보**를 확인해보세요!
- 포스터를 클릭하여 영화 **상세 정보** 및 **리뷰**를 확인해보세요!
- **영화 제목을 검색**하여 영화 상세 정보 및 리뷰를 확인해보세요!
- 관람한 영화 포스터를 선택하여 **익명**으로 **리뷰**를 남겨보세요!
---

---
## 💻 화면 구성
### ✨메인페이지
|![Image](https://github.com/user-attachments/assets/9a073cea-50b5-40ca-bf1f-403abc4c95f1)|
|:---:|
랜덤으로 조회되는 영화 포스터 및 간략한 코멘트|

#### 토글을 통한 국가별 및 장르별 영화 조회
|국가별 조회|
|:---:|
|![Image](https://github.com/user-attachments/assets/fc3989fc-603e-48c8-92d2-a502bad70afe)|

#### 
|장르별 조회|
|:---:|
|![Image](https://github.com/user-attachments/assets/ff742219-e569-4019-9507-06c46725b429)|
#### 
|관람평 TOP 10|
|:---:|
|![Image](https://github.com/user-attachments/assets/a3439e8c-325c-4c7e-9990-022f391f5d01)|
|등록된 리뷰 평점의 평균을 기준 상위10개 영화 조회|
####
|최근 개봉 영화|
|:---:|
|![Image](https://github.com/user-attachments/assets/e1a255f5-b138-4380-8933-90aef562a6cb)|
|개봉년도 기준 최신순으로 정렬된 영화 조회|
### ✨상세 정보 페이지(리뷰 페이지)
#### 포스터 클릭 -> 영화 상세 정보 페이지(리뷰페이지)로 이동
<img width="1857" alt="Image" src="https://github.com/user-attachments/assets/eb563d21-feb5-46b4-bf4d-52a342791086"/>

---




## 🛠️ 프로그램 기능 소개

### 1. **영화 조회 (포스터, 영화 제목)**

* 프로그램 실행 시, **상단 창에 랜덤 영화**가 자동으로 표시됩니다.
* **장르별 / 국가별 필터 토글**을 통해 원하는 영화를 조회할 수 있습니다.
  → **좌우 스크롤**로 더 많은 영화 탐색 가능.
* **평점 Top10 영화** 확인 가능.
  → **좌우 스크롤**로 더 많은 영화 탐색 가능.
* **최근 개봉 영화** 확인 가능.
  → **좌우 스크롤**로 더 많은 영화 탐색 가능.

### 2. **영화 상세 정보 조회**
|**포스터에 마우스 호버 시**, 간략한 영화 정보를 확인할 수 있습니다.|
|:---:|
|<img width="1857" alt="Image" src="https://github.com/user-attachments/assets/a1eb36ab-fcfa-44d2-9a4e-9008e402ea3d" />|


|**포스터 클릭** 및 **영화 제목 검색** 시, |
|:---:|
|![image](https://github.com/user-attachments/assets/3b91cc36-eee4-472f-90ea-9992686ce5cc)|

|영화 상세 페이지로 이동하여 **자세한 정보 확인** 이 가능합니다. |
|:---:|
|![image](https://github.com/user-attachments/assets/59ad8e3d-7898-4421-8eb5-55d60b70884f)|

### 3. **리뷰 조회 및 작성**

|**포스터 클릭 및 영화 제목 검색** → 영화 상세 페이지 이동|
|:---:|
|![image](https://github.com/user-attachments/assets/627f4e41-4a06-4b54-8495-bb89ae20dfe2)|

|페이지 하단에서 **다른 사용자의 리뷰 확인** 가능|
|:---:|
|![image](https://github.com/user-attachments/assets/ba3e7417-7b43-4148-89e4-2258f2d196b8)|

|마우스 호버링을 통한 **별점** 등록 및 **리뷰 입력란**에 내용을 작성하여 리뷰 등록 가능|
|:---:|
|![image](https://github.com/user-attachments/assets/7d9da84c-4c23-4b45-a823-3dd7d836288c)|

|리뷰 등록 시 익명으로 등록됨|
|:---:|
|<img width="1857" alt="Image" src=https://github.com/user-attachments/assets/8936b0c2-f10b-410d-8a7b-af67fe21495b/>|


---

---
## ⚙️ 프로그램 실행 방법
1. opensource-server-0.0.1-SNAPSHOT.jar 파일을 컴퓨터 바탕화면에 다운로드 합니다.
2. cmd창에 `cd Desktop` 명령어를 입력합니다.
3. 이어서 cmd창에 `java -jar opensource-server-0.0.1-SNAPSHOT.jar` 을 입력합니다.
4. Chrome 주소창에 `http://localhost:8080/index.html`을 입력합니다.
5. 영화 리뷰 플랫폼을 사용합니다.
---

## 💁‍♂️ 프로젝트 팀원
김동혁
김현아
이채원
황재희
