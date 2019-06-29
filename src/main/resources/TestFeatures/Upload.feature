Feature:Testing Upload function

  Scenario Outline: Uploading a picture
    Given User on Guru WebSite
    When User uploads "<picture>"

    Examples:
    |picture|
    |‎‎Macintosh HD/Users/tanpan/Downloads/LOGO.png|