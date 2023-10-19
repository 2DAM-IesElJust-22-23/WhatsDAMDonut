# WhatsDAM Donut

## Daniel Zanon Lopez y Carles Talens Selfa

## Version 0.1

#### Pantalla de inicio de sesion añadida
#### Prototipo de chat añadido

## Versión 0.2 by Joel (¬‿¬ ) e Isabel ✖‿✖

### Añadida la clase 'Missatge'

- Esta classe define un Data class que representa un mensaje. Cada mensaje tiene un nombre de usuario y un texto.

### Añadida la clase 'GestorMissatges'

- Clase que se encarga de gestionar la lista de mensajes.
- Método 'afegirMissatge' permite añadir nuevos mensajes a la lista.

### Añadida la clase 'ViewHolder'

- Esta clase sirve para mostrar un mensaje al RecyclerView. Contiene dos vistas, para añadir el texto y la hora actual.

- Contiene un método 'bind' que llena las vistas de los datos.

### Añadida la clase 'Adaptador'

- Esta clase es responsable de crear y enlazar 'ViewHolder' con la lista de mensajes.

#### Métodos añadidos 
- 'onCreateViewHolder' crea un nuevo ViewHolder para un elemento de la lista
- 'onBindViewHolder' vincula datos de la lista con un ViewHolder existente
- 'getItemCount' indica la cantidad de elementos a mostrar

### Modificada la actividad'MessagesWindows'
- Esta actividad muestra los mensajes en un RecyclerView.
- Se configura un RecyclerView, se crea un gestor de mensajes y se asocia un adaptador a la lista de mensajes.
- Cuando se hace clic en el botón de enviar, se recoge el mensaje y se añade a la lista.

#### (✌◠▽◠) ☜(ˆ˘ˆ)
