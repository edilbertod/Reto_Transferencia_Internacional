#Autor: Edi
  #language: es

@HU
Característica: Validacion de pantalla Buscador de Sucursales
  Como usuario
  Quiero realizar la validaccion de la pantalla Buscador de Sucursales
  Para ver si es la pantalla correcta

  @PantallaCorrecta
  Escenario: Validacion correcta de pantalla

    Dado que entro a la seccion de transferencia internacional

    Cuando consulto la pantalla

    Entonces verifico que sea la correcto
      |pantalla|
      |Buscador de Sucursales|

  @PdfCorrecto
  Escenario: Validacion correcta de PDF

      Dado que entro a la seccion de documentos asociados

      Cuando consulto el PDF

      Entonces verifico que sea el pdf correcto
      |titulo|
      |BI_Tarifario_TransfInt-Completar.pdf|


