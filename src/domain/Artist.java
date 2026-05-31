package domain;

/**
 * Представляє сутність художника, який є співробітником компанії 
 * та додатково володіє набором професійних навичок (skills).
 * * @author Твоє Ім'я
 * @version 1.0
 * @see Employee
 */
public class Artist extends Employee {

    /**
     * Конструктор з повним набором параметрів для створення художника.
     * Ініціалізує базові поля співробітника та задає масив його навичок.
     * * @param skiils   масив професійних навичок художника
     * @param name     ім'я та прізвище художника
     * @param jobTitle назва посади
     * @param level    рівень кваліфікації
     * @param dept     назва департаменту
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Конструктор, який створює художника з визначеним масивом навичок.
     * Базові поля співробітника ініціалізуються значеннями за замовчуванням.
     * * @param skiils масив професійних навичок художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    /**
     * Конструктор за замовчуванням.
     * Створює об'єкт художника та виділяє пам'ять під масив для 10 навичок.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає текстове представлення інформації про художника, 
     * включаючи базову інформацію співробітника та перелік його навичок.
     * * @return рядок з атрибутами художника та його навичками
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /** Масив професійних навичок художника. */
    private String[] skiils;

    /**
     * Формує та повертає перелік усіх навичок художника у вигляді одного рядка.
     * Елементи розділяються комою з пробілом.
     * * @return рядок з навичками художника
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює або змінює масив професійних навичок художника.
     * * @param skills новий масив навичок
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Повертає безпосередньо масив рядків із навичками художника.
     * * @return масив навичок у вигляді масиву String
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}