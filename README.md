프로그래밍을 처음 접하고 만들어본 텍스트 게임
게임이라고 하기엔 참 뭐하지만..
어떻게 해야할지 몰라 막 해봤던 기억들이 떠오르는 코드들이다.

* 개요

- 제목 :  10층 건물을올려라!

- 개임설명
2개의 직업 군 중 하나를 선택하여 일을 통해 번 돈으로 벽돌을 사고 / 쌓아 건물을 지어라 (시연을 위해 1.5층으로 목표수정)

- 상세정보
직업
건설노동자 (벽돌관련 + 능력을 가짐)
초기자산 : 1천원
일급 : 1만원
전직가능 (10턴 후)
기술자 (벽돌사기 +2)
안전요원 (일급 +@)
사업가 (수익금액이 랜덤)
초기자산 : 1만원
턴이 진행될 때마다 자산에 랜덤으로 수익이 증가

아이템 / 건물
벽돌
개당 : 1만원 (살때마다 차감)

건물
벽돌 10개당 1층

-사용된 쓰레드

노래 쓰레드
배경음악 (1)
행동별 효과음 (4)

로딩 쓰레드
게임이 시작되었다는 느낌을 주기 위함

이벤트 쓰레드
랜덤으로 지진이 발생해 쌓아올린 건물의 벽돌 수가 하락함 (쌓아올린 벽돌이 - 됨)
일을한다 행동 중 럭키찬스가 발생하고 제시 되는 숫자 중 하나를 선택 (랜덤으로 재산이 + 됨)

글씨 쓰레드
가독성을 높이기 위해 텍스트가 0.8초 마다 출력됨
