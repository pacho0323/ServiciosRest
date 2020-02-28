#language: es
# encoding: iso-8859-1
#Author: jbuiles@qvision.com.co
Característica: Automatizar un servicio Rest
  Como usuario deseo de una app
  Quiero enviar unos datos
  Para probar el resultado

  @Test1
  Esquema del escenario: Buscar usuario
    Dado que el usuario ingrese la url del servicio
    Cuando ingrese el <id>
    Entonces verá en la respuesta los datos
      | <name> | <lastName> | <codeResponse> |

    Ejemplos: 
      | id | name   | lastName | codeResponse |
      |  1 | George | Bluth    |          200 |

  @Test2
  Esquema del escenario: Crear usuario
    Dado que el usuario ingrese la url del servicio
    Cuando ingrese los datos
      | <name> | <lastName> |
    Entonces el vera el usuario creado
      | <name> | <lastName> | <codeResponse> |

    Ejemplos: 
      | name       | lastName | codeResponse |
      | Sarah-Jane | Smith    |          201 |

  @Test3
  Esquema del escenario: Actulizar usuarios
    Dado que el usuario ingrese la url del servicio
    Cuando ingrese el dato a actualizar
      | <name> | <lastName> |
    Entonces el vera el usuario actualizado
      | <name> | <lastName> | <codeResponse> |

    Ejemplos: 
      | name | lastName | codeResponse |
      | jack | smith    |          200 |

  @Test4
  Esquema del escenario: Eliminar usuario
    Dado que el usuario ingrese la url del servicio
    Cuando ingrese el id <id>
    Entonces verá el código de respuesta <codeResponse>

    Ejemplos: 
      | id | codeResponse |
      |  1 |          204 |
