package ch04.reference;

public class ImmutableObject {
  private Member member;
  private Member enemy;

  public ImmutableObject(Member member, Member enemy){
    this.member = member;
    this.enemy = enemy;
  }
  // damage 를 계산하는 게임 코드
  int damage(){
    int tmp = member.power() + member.weaponAttack();
    tmp = (int) (tmp * (1f + member.speed() / 100f));
    tmp = tmp - (int) (enemy.defence / 2);
    tmp = Math.max(0, tmp);

    return tmp;
  }

  class Member{
    int power, speed, defence, weapon;

    Member(){
      power = 50;
      speed = 30;
      defence = 40;
      weapon = 0;
    }
    int power(){
      return this.power;
    }

    int weaponAttack(){
      return weapon;
    }

    float speed(){
      return this.speed;
    }
  }

}
