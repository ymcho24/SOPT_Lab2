# SOPT_Lab2


※ 과제는 해당되는 branch에 각각 업로드 했습니다.



▶ 기본과제1

![12345](https://user-images.githubusercontent.com/52772787/80628999-28567d00-8a8d-11ea-9fac-d1a60eab0b9f.png)



 
 
▶ 기본과제2 - itemDecoration



![ex2_2](https://user-images.githubusercontent.com/52772787/80633857-6c00b500-8a94-11ea-89e2-ee4a33b0dcb8.png)


아이템들 사이에 구분선을 주어 각각의 아이템 간의 구분이 가능하도록 한다.

ItemDecoration을 상속받는 클래스 ExampleItemDecoration를 작성하여 새로 추가하고

HomeFragment의 onViewCreated 함수 안에 loadDatas() 밑에 (리사이클러뷰 어댑터 지정해 둔 코드 다음에) 



rv_home.apply {
            
            
            addItemDecoration(ExampleItemDecoration())
            
        } 
        
추가한다. <= ItemDecoration을 장착한 것


참고 : https://blog.naver.com/devks0228/221653361005



 
 
▶ 기본과제2 - clipToPadding



![ex3](https://user-images.githubusercontent.com/52772787/80637201-8a1ce400-8a99-11ea-91fd-66ac10c975dc.png)



fragment_home.xml 파일의 리사이클러뷰 안에 android:padding="12dp"로 상하좌우 padding을 주고


android:clipToPadding="false"를 하면 좌우 여백은 항상 존재하지만 스크롤 할 시에 상하 여백은 없어진다.



디폴트상태인 android:clipToPadding="true"를 해주면 상하좌우 여백이 스크롤 하는 중에도 항상 존재한다.


 
  
▶ 성장과제1

![6_1](https://user-images.githubusercontent.com/52772787/81356795-056f3d00-910d-11ea-8691-5257a793e9da.png)


▷ 한줄로만 아이템들이 나열되는 문제 해결 위해 추가해준 부분 : 

WebtoonFragment.kt의 onViewCreated 함수 내에 

rv_webtoon.layoutManager = GridLayoutManager(context, 3)

문장을 추가해준다. 열개수를 지정하는 numColumns 값은 3으로 지정한다. => 3줄로 아이템들이 나열됨


참고 : https://stackoverflow.com/questions/45927061/gridlayout-in-kotlin
