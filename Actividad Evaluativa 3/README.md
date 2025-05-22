Descripción de la solución: 
La solución se enfocó en construir un sistema de personajes para un juego de combate sencillo, con una arquitectura clara y fácil de entender. Se siguieron estos principios:

1-Simplicidad: Se eliminó lógica innecesaria, condicionales complicadas o estructuras redundantes.

2-Claridad: Se priorizó el uso de nombres comprensibles (por ejemplo, mostrarEstado(), recibirDanio(), estaVivo()).

3-Consistencia: Se mantuvo un formato similar en todas las clases, lo que facilita el mantenimiento del código.

4-Separación de responsabilidades: Cada clase representa a un tipo específico de personaje con sus atributos y métodos propios.




Análisis de los códigos y decisiones tomadas:

1-Hechicero Arcano: Se simplificó su lógica de hechizos: solo lanza un hechizo si tiene energía suficiente.
-Se mantuvo el atributo nivelMagia para representar su poder mágico.

2-Espartano: Se usó un sistema de combate simple con daño aleatorio.

-Tiene vida, puede atacar y recibir daño, e imprime su estado.

3-Berseker: Evolución del antiguo “Guerrero”.

-Tiene un atributo único: fuerza, que afecta su daño al atacar.

-Puede atacar a cualquier otro tipo de personaje (Espartano, HechiceroArcano).

4-Main/Personajes: Se crearon clases con el método main para poder simular batallas.

Se mantuvo todo en un único archivo para lograr las pruebas simples.

Se muestran los estados antes y el después del combate para tener visibilidad de los efectos.

NOTA: Para todo esto busque basarme en GOD OFWAR ya que es uno de mis juegos favoritos y su temáticas y criaturas son interesantes, por eso existe el “Berserker” y el “Espartano” a forma de referencia y alusión a la misma temática del olimpo en Grecia 
