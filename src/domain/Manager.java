package domain;

/**
 * Представляє сутність менеджера, який є співробітником компанії 
 * та додатково має в підпорядкуванні групу інших співробітників.
 * * @author Твоє Ім'я
 * @version 1.0
 * @see Employee
 */
public class Manager extends Employee {

    /**
     * Конструктор з повним набором параметрів для створення менеджера.
     * Ініціалізує базові поля співробітника та призначає масив підлеглих.
     * * @param employees масив підлеглих співробітників
     * @param name      ім'я та прізвище менеджера
     * @param jobTitle  назва посади
     * @param level     рівень кваліфікації
     * @param dept      назва департаменту
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає текстове представлення інформації про менеджера, 
     * включаючи базову інформацію співробітника та список імен його підлеглих.
     * * @return рядок з атрибутами менеджера та його підлеглими
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * Конструктор, який створює менеджера з визначеним масивом підлеглих.
     * Базові поля співробітника ініціалізуються значеннями за замовчуванням.
     * * @param employees масив підлеглих співробітників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Конструктор за замовчуванням.
     * Створює об'єкт менеджера та виділяє пам'ять під масив для 10 підлеглих.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /** Масив співробітників, які перебувають у підпорядкуванні цього менеджера. */
    private Employee[] employees;

    /**
     * Формує та повертає перелік імен усіх підлеглих співробітників у вигляді одного рядка.
     * Імена розділяються комою з пробілом.
     * * @return рядок з іменами підлеглих
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює або змінює масив підлеглих співробітників.
     * * @param employees новий масив підлеглих
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає безпосередньо масив об'єктів підлеглих співробітників.
     * * @return масив об'єктів {@link Employee}
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}