package domain;

/**
 * Представляє базову сутність співробітника компанії.
 * Містить інформацію про його ім'я, посаду, унікальний ідентифікатор, 
 * рівень кваліфікації та приналежність до департаменту.
 * * @author Твоє Ім'я
 * @version 1.0
 */
public class Employee {

    /**
     * Повертає текстове представлення інформації про співробітника.
     * * @return рядок з усіма основними атрибутами співробітника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /** Ім'я та прізвище співробітника. */
    private String name;
    /** Назва посади співробітника. */
    private String jobTitle;
    /** Унікальний числовий ідентифікатор співробітника. */
    private int ID;
    /** Рівень кваліфікації співробітника (діапазон від 1 до 3). */
    private int level;
    /** Назва департаменту або відділу співробітника. */
    private String dept;

   // private static int employeesCount = 0;

    /**
     * Конструктор з параметрами для створення нового співробітника.
     * Ініціалізує ID за допомогою конструктора без параметрів, 
     * а також перевіряє та встановлює рівень кваліфікації.
     * * @param name     ім'я та прізвище співробітника
     * @param jobTitle назва посади
     * @param level    рівень кваліфікації (дозволені значення: 1, 2, 3; за замовчуванням: 1)
     * @param dept     назва департаменту
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Конструктор за замовчуванням.
     * Автоматично генерує випадковий числовий ідентифікатор (ID) у межах від 0 до 999.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює або змінює посаду співробітника.
     * * @param job нова назва посади
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * Повертає поточну посаду співробітника.
     * * @return назва посади
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * Повертає ім'я співробітника.
     * * @return ім'я співробітника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень кваліфікації співробітника.
     * Якщо передане значення не входить у діапазон від 1 до 3, встановлюється рівень 1.
     * * @param level новий рівень кваліфікації (1, 2 або 3)
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень кваліфікації співробітника.
     * * @return числовий рівень кваліфікації
     */
    public int getLevel() {
        return level;
    }
    /**
     * Повертає назву департаменту співробітника.
     * * @return назва департаменту
     */
    public String getDept() {
        return dept;
    }
    /**
     * Встановлює або змінює назву департаменту співробітника.
     * * @param dept нова назва департаменту
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я співробітника після валідації через регулярний вираз.
     * Якщо ім'я не відповідає шаблону (наприклад, містить цифри або некоректні символи), 
     * співробітнику присвоюється ім'я за замовчуванням — "John Doe".
     * * @param name ім'я для перевірки та встановлення
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
