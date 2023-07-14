/**
/ Абстрактный класс для представления покупателя.
/ Реализует интерфейс iActorBehaviour
*/

package Classes;

import Interfaces.iActorBehaviuor;

import Interfaces.iReturnOrder;
/** базовый (родительский) класс */

public abstract class Actor implements iActorBehaviuor {
    /** имя */
    protected String name;
    /** статус выполнения заказа */
    protected boolean isTakeOrder;
    /** статус получения заказа  */
    protected boolean isMakeOrder;

    /** статус оплаты  */
    protected boolean isTakeCash;
    /** статус возврата заказа */
    protected boolean isMakeReturnOrder;
    
    /**
     * конструктор класса
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * гет метод для получения имени
     */
    abstract public String getName();

    // public boolean isTakeOrder() {
    //     return isTakeOrder;
    // }

    // public boolean isMakeOrder() {
    //     return isMakeOrder;
    // }

    // public void setTakeOrder(boolean takeOrder) {
    //     isTakeOrder = takeOrder;
    // }

    // public void setMakeOrder(boolean makeOrder) {
    //     isMakeOrder = makeOrder;
    // }
}