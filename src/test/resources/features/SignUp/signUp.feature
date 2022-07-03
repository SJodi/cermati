@signUp
Feature: Sign Up
  As a user
  I want to sign up into cermati
  So that i can create new user

  @TestCase01
  Scenario: 01- User can access sing up page from main page
    Given user open cermati page
    When user click on menu 'daftar'
    Then sign up pages will be shown

  @TestCase02
  Scenario Outline: 02 - Failed sing up with empty input
    Given user on sign up page
    When user click daftar without any input on field register
    Then alert is shown alert email "<alertEmail>" and alert Mobile Phone "<alertMobilePhone>" and alert Password "<alertPassword>" and alert Confirm Password "<alertConfirmPassword>" and alert First Name "<alertFirstName>" and alert Last Name "<alertLastName>" and alert City "<alertCity>" and password note "<passwordNote>"
    Examples:
    |alertEmail|alertMobilePhone|alertPassword|alertConfirmPassword|alertFirstName|alertLastName|alertCity|passwordNote|
    |Input ini wajib diisi.|Input ini wajib diisi.|Input ini wajib diisi.|Input ini wajib diisi.|Input ini wajib diisi.|Input ini wajib diisi.|Input ini wajib diisi.|Kata sandi harus memiliki panjang antara 8-50 karakter dan mengandung minimal 1 huruf besar, 1 huruf kecil, dan 1 angka|

  @TestCase03
  Scenario Outline: 03 - Failed sing up with invalid input
    Given user on sign up page
    And user fill fields email "<email>" and Mobile Phone "<mobilePhone>" and Password "<Password>" and  Confirm Password "<ConfirmPassword>" and First Name "<FirstName>" and Last Name "<LastName>" and City "<City>"
    Then alert is shown alert email "<alertEmail>" and alert Mobile Phone "<alertMobilePhone>" and alert Password "<alertPassword>" and alert Confirm Password "<alertConfirmPassword>" and alert First Name "<alertFirstName>" and alert Last Name "<alertLastName>" and alert City "<alertCity>" and password note "<passwordNote>"
    Examples:
      |email|mobilePhone|Password|ConfirmPassword|FirstName|LastName|City|alertEmail|alertMobilePhone|alertPassword|alertConfirmPassword|alertFirstName|alertLastName|alertCity|passwordNote|
      |123|123|123|asdf|123|12312|123|Format email tidak valid.|Nomor handphone tidak valid.|Kata sandi tidak memenuhi syarat|Kata Sandi tidak cocok|Input harus berupa huruf.|Input harus berupa huruf.|Kabupaten/Kota tidak tersedia di dalam pilihan yang ada.|Kata sandi harus memiliki panjang antara 8-50 karakter dan mengandung minimal 1 huruf besar, 1 huruf kecil, dan 1 angka|

  @TestCase04
  Scenario Outline: 04 - Success sing up with valid input
    Given user on sign up page
    And user fill fields email "<email>" and Mobile Phone "<mobilePhone>" and Password "<Password>" and  Confirm Password "<ConfirmPassword>" and First Name "<FirstName>" and Last Name "<LastName>" and City "<City>"
    And user click button 'Daftar'
    Then user will be shown OTP verification page
    Examples:
      |email|mobilePhone|Password|ConfirmPassword|FirstName|LastName|City|
      |random01@gmail.com|081270709098|Ini@password123|Ini@password123|Setiawan|Jodi|KOTA JAKARTA BARAT|