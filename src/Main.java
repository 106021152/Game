public class Main {
    public static void main(String[] args) {
       AttacheHero attache = new AttacheHero("館長",100, 40, "三秒讓你躺", "男");
       attache.ShowInto();
       System.out.println("=======================");
       CustomsHero custom = new CustomsHero("琦夢",70, 50, "墨汁大噴射", "女");
       custom.ShowInto();
       System.out.println("=======================");
       MagicHero magic = new MagicHero("白鬍子爹", 50,150,"超級冰風雪", "男");
       magic.ShowInto();System.out.println("=======================");
       MilitaryHero milit = new MilitaryHero("諸葛亮", 80, 60,"統整一方","男");
       milit.ShowInto();System.out.println("=======================");
    }
}