#language: es
# encoding: iso-8859-1
#Author: jbuiles@qvision.com.co
Caracter�stica: Automatizar un servicio Rest

  @Test1
  Escenario: getUsuario
    Dado que el usuario ingrese la url del servicio
    Cuando ingrese el id
    Entonces ver� el c�digo de respuesta
      | 1 | George | Bluth | 200 |

  @Test2
  Escenario: Consultar usuarios
    Dado que el usuario ingrese la url del servicio
    Cuando ingrese los datos
    Entonces ver� el c�digo de respuesta 201

  @Test3
  Escenario: Actulizar usuarios
    Dado que el usuario ingrese la url del servicio
    Cuando ingrese el dato a actualizar
    Entonces ver� el c�digo de respuesta 200

  @Test4
  Escenario: Eliminar usuario
    Dado que el usuario ingrese la url del servicio
    Cuando ingrese el dato a eliminar
    Entonces ver� el c�digo de respuesta 204
