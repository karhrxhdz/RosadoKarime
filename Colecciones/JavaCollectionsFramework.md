# Java Collections Framework  
***Karime Rosado Hernández, 19100252***  


La colección en Java es un marco que proporciona una arquitectura para almacenar y manipular el grupo de objetos.

Java Collections puede lograr todas las operaciones que realiza en un dato, como la búsqueda, la ordenación, la inserción, la manipulación y la eliminación.

Java Collection significa una sola unidad de objetos. Java Collection framework proporciona muchas interfaces (Set, List, Queue, Deque) y clases(ArrayList,
Vector, LinkedList,
PriorityQueue,
HashSet, LinkedHashSet, TreeSet).

**¿Qué es Collection en Java?**
Una colección representa una sola unidad de objetos, es decir, un grupo.

**¿Qué es un framework en Java?**
* Proporciona una arquitectura readymade.
* Representa un conjunto de clases e interfaces.
* Es opcional.

**¿Qué es collection framework?**
El marco de la colección representa una arquitectura unificada para almacenar y manipular un grupo de objetos. Cuenta con:

* Interfaces y sus implementaciones, es decir, clases
* Algoritmo  


# Colecciones en Java
Hay tres tipos de colecciones, cada uno con un interfaz común y diferentes implementaciones. Las diferentes implementaciones de un mismo interfaz realizan la misma tarea aunque la diferencia está en que unas implementaciones son más rápidas en algunas operaciones y más lentas en otras:
* Conjunto 
* Listas
* Diccionario o Matriz asociativa  

 **CONJUNTO**  
 Los conjuntos son estructuras de datos donde los elementos no tienen un orden y no se permiten duplicados. Para definirlos se utiliza la interfaz Set<E>, que no añade nuevos métodos a la interfaz Collection<E>. Por lo tanto, con los métodos anteriores podrás manipular tus conjuntos. 

Podemos utilizar diferentes implementaciones. La más eficiente es HashSet<E> (implementación con tabla hash). Pero si queremos que los elementos queden ordenados podemos usar TreeSet<E> (implementación con árbol).

**LISTAS**  
Una lista es una estructura secuencial, donde cada elemento tiene un índice o posición. También recibe el nombre de array o vector unidimensional. El índice de una lista es siempre un entero y el primer elemento ocupa la posición 0.   Para trabajar con ellas se utiliza el interfaz List<E>. Las implementaciones más recomendables son: ArrayList<E>si queremos acceder a una posición de forma muy rápida o LinkedList<E> si queremos inserciones y borrado muy rápidos.

La interfaz List<E> hereda todos los métodos de Collection<E> y añade los siguientes:

boolean add(int indice, E e): Inserta un nuevo elemento en una posición. El elemento que estaba en esta posición y los siguientes pararán a la siguiente.

E get(int indice): Devuelve el elemento en la posición especificada.

int indexOf(E e): Primera posición en la que se encuentra un elemento; -1 si no está.

int lastIndexOf(E e): Última posición del el elemento especificado; o -1 si no está.

E remove(int indice): Elimina el elemento de la posición indicada.

E set(int indice, E e): Pone un nuevo elemento en la posición indicada. Devuelve el elemento que se encontraba en dicha posición anteriormente.  

**DICCIONARIO O MATRIZ ASOCIATIVA**
Los diccionarios (también conocidos como mapas o matrices asociativas) son estructuras de datos donde cada elemento tiene asociado una clave que usaremos para recuperarlo (en lugar del índice de una lista). Para definirlos se utiliza la interfaz Map<K,V>. En este caso se trabaja con dos clases una que se utiliza como clave (K) y otra para almacenar los valores (V). La idea es que cada elemento se almacena mediante un par de objetos (K,V). Esta estructura de datos nos permite obtener el objeto V muy rápidamente, a partir de su clave K. Por ejemplo, podríamos almacenar objetos de la clase Vehiculo y utilizar como clave su matrícula en un String. De esta forma, a partir de la matrícula  un diccionario encontraría el vehículo asociado muy rápidamente.

Podemos utilizar las siguientes implementaciones de este interfaz: HashMap<K,V>,TreeMap<K,V>,LinkedHashMap<K,V>

Veamos los métodos del interfaz Map<K,V> (Ojo. A diferencia de otras colecciones no hereda del interfaz Collection<E>) ).

V put(K key, V value): Añade un nuevo par clave-valor al diccionario.

V get(Object key): Da el valor asociado a una clave o null si no se encontró.

V remove(Object key): Elimina el par clave-valor que corresponde a la clave.

boolean containsKey(Object key): Comprueba si está la clave especificada.

boolean containsValue(Object value): Comprueba si está el valor.

Set keySet(): Devuelve un conjunto con las claves contenidas en el diccionario.

Collection values(): Devuelve una colección con solo los valores.

boolean isEmpty(): Comprueba si la colección está vacía.

int size(): Devuelve el número de elementos que contiene la colección.

void clear(): Elimina todos los elementos de la colección.
