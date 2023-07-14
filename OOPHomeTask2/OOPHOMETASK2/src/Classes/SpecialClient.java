/**
* Класс SpecialClient представляет объект покупателя с особым статусом (VIP).
* Наследуется от класса Actor и добавляет поле idVip для идентификации покупателя.
* Класс может принимать заказы и выполнять заказы.
*/

package Classes;

/** Класс VIP клент, наследуется от родительского класса Actor */
public class SpecialClient extends Actor{
    /** персональный номер VIP клиента. Приватный(инкапсуляция) */
    private int idVip;
    
    /**
     * базовый конструктор класса VIP клиент
     */
    public SpecialClient(String name, Integer id) {
        super(name);
        idVip = id;
    }

    /** Переопределение метода для получение Имени */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Геттер. метод для получение персонального номера
     * @return персональный номер VIP клиента
     */
    public int getIdVip() {
        return idVip;
    }

    /** переопределение метода: получен ли заказ */
    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    /** переопределение метода: сделан ли заказ */
    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    /** Сеттер. переопределение метода: заказ получен */
    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    /** Сеттер. переопределение метода: сделан заказ */
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    /** переопределение метода: получить Клиента */
    public Actor getActor() {
      return this;
    }

    /** переопределение метода:  есть ли заявка на возврат товара */
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /* переопределение метода забрал ли деньги */
    public boolean isTakeCash() {
        return super.isTakeCash;
    }

    /* переопределение метода сделал заявку на возврат */
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /* переопределение метода забрать деньги */
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
    }


    // @Override
    // public String getName() {
    //     return name;
    // }

    // public int getIdVip() {
    //     return idVip;
    // }
}