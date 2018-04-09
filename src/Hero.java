public class Hero {
    String Name, Skill, Sex;
    int Hp, Mp;
    Hero (String name, int hp, int mp, String skill, String sex){
        setName(name);
        setHp(hp);
        setMp(mp);
        setSkill(skill);
        setSex(sex);
    }
    public String getName() {
        return Name;
    }
    public int getHp() {
        return Hp;
    }
    public int getMp() {
        return Mp;
    }
    public String getSkill() {
        return Skill;
    }
    public String getSex() {
        return Sex;
    }
    public void setName(String name) {
        if (name.length() > 20) {
            this.Name =Name.substring(0,20);
        } else {
            this.Name = name;
        }
    }
    public void setHp(int hp) {
        if (hp > 100) {
            this.Hp = 100;
        }else if(hp<0){
            this.Hp= 0;
        }else {
            this.Hp=hp;
        }
    }
    public void setMp(int mp) {
        if (mp > 200) {
            this.Mp = mp;
        } else if (mp < 0) {
            this.Mp = 0;
        } else {
            this.Mp = mp;
        }
    }
    public void setSkill(String skill) {
        this.Skill=skill;
    }
    public void setSex(String sex) {
        if (sex.equals("女") || sex.equals("男")){
            this.Sex = sex;
        }else {
            this.Sex = "Fall";
        }
    }

    public void ShowInto(){
        System.out.println("姓名："+Name);
        System.out.println("性別："+Sex);
        System.out.println("血量："+Hp);
        System.out.println("魔力："+Mp);
        System.out.println("技能："+Skill);
    }
}
