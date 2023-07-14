/**
Класс PensionerClient представляет объект покупателя, участвующего в акции.
* Класс может принимать заказы и выполнять заказы.
*/

package Classes;

/** Класс промо покупатель, наследуется от родительского класса Actor */
public class PensionerClient extends Actor {
    
    /** персональный номер промо покупателя. Приватный(инкапсуляция) */
    private int pensID;

    /**
     * базовый конструктор класса промо покупатель
     */
    public PensionerClient(String name, int pensID) {
        super(name+" - пенсионер");
        this.pensID = pensID;
    }

    /**
     * Getter метод для получение персонального номера
     * @return персональный номер покупателя
     */
    public int getPensId() {
        return pensID;
    }

    /** Переопределение метода для получение Имени */
    @Override
    public String getName() {
        return super.name;
    }

    /** переопределение метода: получен ли заказ покупателем*/
    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    /** переопределение метода: сделан ли заказ покупателем*/
    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    /** Setter. переопределение метода: заказ получен покупателем*/
    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
    /** Setter. переопределение метода: сделан заказ покупателем*/
    public void setMakeOrder(boolean pikUpOrder) {
      super.isTakeOrder = pikUpOrder;
    }

    /** переопределение метода: получить покупателя */
    public Actor getActor() {
      return this;
    }
    
    /** переопределение метода: есть ли заявка на возврат товара */
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /* переопределение метода: забрал ли покупатель деньги */
    public boolean isTakeCash() {
        return super.isTakeCash;
    }

    /* переопределение метода: сделал ли покупатель заявку на возврат */
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /* переопределение метода: покупатель забирает деньги */
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
    }



}