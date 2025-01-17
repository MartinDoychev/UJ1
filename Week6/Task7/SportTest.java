/*Създайте клас Sport който има само следните два метода: * getName() – връща: “General Sport” * getNumberOfTeamMembers() – Връща: “Each team has n players in ” + getName()
Създайте и клас Soccer който наследява Sport. Класът Soccer override-ва getName() т. че той да връща “Soccer”.
В Soccer същот се Override-ва и getNumberOfTeamMembers() т че той да връща 11.
В SportTest клас създайте обект “soccer” от тип Sport който е инстанция на класа Soccer.
Създайте също обект “sport” от тип Sport който е инстанция на класа Sport.
Изведете в конзолата soccer.getName(), soccer.getNumberOfTeamMembers(), soccer.getClass(), soccer.getClass().getSuperclass()
Изведете в конзолата sport.getName(), sport.getNumberOfTeamMembers(), sport.getClass(), sport.getClass().getSuperclass()
Разгледайте и се опитайте да си обясните двата изхода. */
public class SportTest {
    public static void main(String[] args) {
        Sport soccer = new Soccer();
        Sport sport = new Sport();

        System.out.println("soccer.getName(): " + soccer.getName());
        System.out.println("soccer.getNumberOfTeamMembers(): " + soccer.getNumberOfTeamMembers());
        System.out.println("soccer.getClass(): " + soccer.getClass());
        System.out.println("soccer.getClass().getSuperclass(): " + soccer.getClass().getSuperclass());

        System.out.println();

        System.out.println("sport.getName(): " + sport.getName());
        System.out.println("sport.getNumberOfTeamMembers(): " + sport.getNumberOfTeamMembers());
        System.out.println("sport.getClass(): " + sport.getClass());
        System.out.println("sport.getClass().getSuperclass(): " + sport.getClass().getSuperclass());
    }
}