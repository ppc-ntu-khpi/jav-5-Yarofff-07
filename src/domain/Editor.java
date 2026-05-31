package domain;

/**
 * Представляє сутність редактора, який є різновидом художника (Artist) 
 * та додатково має налаштування щодо специфіки редагування (електронне чи паперове).
 * * @author Твоє Ім'я
 * @version 1.0
 * @see Artist
 * @see Employee
 */
public class Editor extends Artist {

    /**
     * Конструктор з повним набором параметрів для створення редактора.
     * Ініціалізує базові поля співробітника, масив навичок художника та тип редагування.
     * * @param electronicEditing прапорець електронного редагування (true — електронне, false — паперове)
     * @param skiils            масив професійних навичок
     * @param name              ім'я та прізвище редактора
     * @param jobTitle          назва посади
     * @param level             рівень кваліфікації
     * @param dept              назва департаменту
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор, який створює редактора з визначеним типом редагування та масивом навичок.
     * Інші параметри співробітника ініціалізуються значеннями за замовчуванням.
     * * @param electronicEditing прапорець електронного редагування
     * @param skiils            масив професійних навичок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Конструктор, який створює редактора із заданим типом редагування.
     * Масив навичок та текстові поля ініціалізуються значеннями за замовчуванням.
     * * @param electronicEditing прапорець електронного редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }
    
    /**
     * Конструктор за замовчуванням.
     * Створює об'єкт редактора, встановлюючи режим електронного редагування як основний (true).
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає текстове представлення інформації про редактора.
     * Включає інформацію про співробітника, його навички художника, а також перевагу в редагуванні.
     * * @return рядок з усіма атрибутами редактора та типом його роботи ("electronic" або "paper")
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= "; 
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    /** Прапорець, що вказує на формат редагування: true — електронний, false — паперовий. */
    private boolean electronicEditing;

    /**
     * Повертає поточні налаштування формату редагування.
     * * @return true, якщо обрано електронне редагування; false, якщо паперове
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює або змінює налаштування формату редагування.
     * * @param electronic новий формат роботи (true для електронного, false для паперового)
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}