/**
Этот интерфейс определяет поведение покупателя в супермаркете
*/

package Interfaces;

import Classes.Actor;

/** интерфейс Очереди клиентов */
public interface iActorBehaviuor {
    /** получен ли заказ */
    public boolean isTakeOrder() ;
    /** сделан ли заказ */
    public boolean isMakeOrder() ;
    /** Получен заказ */
    public void setTakeOrder(boolean takeOrder) ;
    /** сделан заказ */
    public void setMakeOrder(boolean makeOrder) ;
    /** покупатель */
    Actor getActor();
    
}