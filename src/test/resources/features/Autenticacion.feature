# language: es

Característica: autenticarse en la pagina demo2 motivaxion

  Esquema del escenario: Inicio de sesion en la pagina demodos motivaxion
    Dado que el usuario se autentica en la pagina demo dos motivaxion
      | jujudemo | 12345678 |
    Cuando realice la publicacion de una noticia
      | <Descripcion> | <Link> |
    Entonces se visualiza la publicacion de la noticia
      | <Descripcion> |
    Ejemplos:
      | Descripcion                                               | Link                                                         |
      | Nuevas aplicaciones de Inteligencia Artificial en el 2020 | https://www.youtube.com/watch?v=itDocS0u-UU&ab_channel=AddKw |