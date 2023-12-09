/*Сега в друг пакет копирайте класа Sport и го направете да е Java Bean със следните атрибути name и numberOfTeamMembers.
Копирайте и клас Soccer. Направете и него на Java Bean.
Направете така, че в Soccer винаги numberOfTeamMembers ще е 11, а името ще е “Soccer”.
В SportTest клас създайте обект “soccer” от тип Sport който е инстанция на Soccer
Създайте също обект “sport” от тип Sport който е инстанция на класа Sport.
Изведете в конзолата soccer.getName(), soccer.getNumberOfTeamMembers(), soccer.getClass(), soccer.getClass().getSuperclass()
Изведете в конзолата sport.getName(), sport.getNumberOfTeamMembers(), sport.getClass(), sport.getClass().getSuperclass()
Разгледайте и се опитайте да си обясните двата изхода. */
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class SportTest {
    public static void main(String[] args) throws IntrospectionException {
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

        BeanInfo beanInfo = Introspector.getBeanInfo(Sport.class);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

        System.out.println("\nBean properties for Sport class:");
        for (PropertyDescriptor descriptor : propertyDescriptors) {
            System.out.println(descriptor.getName());
        }
    }
}