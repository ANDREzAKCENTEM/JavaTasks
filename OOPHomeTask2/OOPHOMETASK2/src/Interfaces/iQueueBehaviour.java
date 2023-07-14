/**
Этот интерфейс определяет поведение очереди в супермаркете
*/

package Interfaces;

import Classes.Actor;

/** интерфейс Очереди */
public interface iQueueBehaviour {
    /** клиент  попал в очередь */
    void takeInQueue(iActorBehaviuor actor);
    /** клиент покинул очередь */
    void releaseFromQueue();
    /** клиент получил заказ */
    void takeOrder();
    /** клиент сделал заказ */
    void giveOrder();
}