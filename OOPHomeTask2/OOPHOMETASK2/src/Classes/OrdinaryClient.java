/**
* Класс OrdinaryClient представляет объект обычного клиента.
* Наследуется от класса Actor и используется для идентификации клиента.
* Класс может принимать заказы и выполнять заказы.
*/

package Classes;

/** класс Обычный клиент */
public class OrdinaryClient extends Actor {
    // private boolean setTakeOrder;
    // private boolean setMakeOrder;

    /**
     * Базовый конструктор класса
     */
    public OrdinaryClient(String name) {
        super(name);
    }

    /** Переопределение метода для получение Имени */
    @Override
    public String getName() {
        return super.name;
    }

    /** переопределение метода:  забрал ли заказ покупатель*/
    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    /** переопределение метода: покупатель сделал ли заказ */
    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    /** Сеттер. переопределение метода : покупатель сделал заказ  */
    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    /** Сеттер.перопределение метода: покупатель получил заказ */
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    /** переопределение метода: получить */
    public Actor getActor() {
      return this;
    }

    /** переопределение метода: есть ли заявка от покупателя на возврат товара */
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /* переопределение метода забрал ли деньги покупатель*/
    public boolean isTakeCash() {
        return super.isTakeCash;
    }

    /* переопределение метода: покупатель сделал заявку на возврат */
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /* переопределение метода: покупатель забрад деньги */
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
    }



    // public boolean isSetTakeOrder() {
    //     return setTakeOrder;
    // }

    // public void setSetTakeOrder(boolean setTakeOrder) {
    //     this.setTakeOrder = setTakeOrder;
    // }

    // public boolean isSetMakeOrder() {
    //     return setMakeOrder;
    // }

    // public void setSetMakeOrder(boolean setMakeOrder) {
    //     this.setMakeOrder = setMakeOrder;
    // }

    // @Override
    // public String getName() {
    //     return name;
    // }
}