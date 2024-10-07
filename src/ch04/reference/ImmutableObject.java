package ch04.reference;

public class ImmutableObject {
  // damage 를 계산하는 게임 코드
  int damage(){
    int tmp = member.power().member.weaponAttack();
    tmp = (int) (tmp * (1f + member.speed() / 100f));
    tmp = tmp - (int) (enemy.defence / 2);
    tmp = Math.max(0, tmp);

    return tmp;
  }

}
