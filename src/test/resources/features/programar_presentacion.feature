#language: es
Característica: Programar una presentación de proyecto
  Yo como usuario del millon and up
  Necesito realizar la programación de presentación de proyecto en el portal web
  Para tener una agenda de presentación


  @ProgramarPresentacion
  Escenario: Validar que un usuario pueda programar una presentación de proyecto por zoom
    Dado el usuario ingresa al portal de millon and up
    Cuando el usuario diligencia la informacion para programar una presentacion de proyecto
      | hora | correo       | nombre     | telefono   |
      | 1 PM | pruebas@.com | Pruebas QA | 3057445684 |
    Entonces el cliente podra visualizar los datos de la presetnacion agendada