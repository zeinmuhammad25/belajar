@Regression
Feature: Regression Web Point of Sales
  In the following automation test cases are the regression features that exist in the web point of sales


#  Scenario: User Create new category
#    Given User open POS web
#    When User input "admin" as userId and "123" as password
#    And User click button master
#    And User click button kategori
#    When User input "Kategori1" as a new kategori
#    And User click button insert data
#    Then User already see a new category
#
##    hapus kategori untuk keperluan otomasi
#    And delete
#
#  Scenario: User create new item
#    Given User open POS web
#    When User input "admin" as userId and "123" as password
#    And User click button master
#    And User click button barang
#    And User insert data barang
#    When User input "kategori otomasi" as kategori barang and "otomasi" as nama barang and "sda" as merk barang "2500" as harga beli
#    When User input "3000" as hargaJual and "PCS" as satuan Barang "3000" as stok beli
#    Then User already see new item in data barang page
#
#    ##    hapus kategori untuk keperluan otomasi
#    And delete
#
#  Scenario: User edit profil
#    Given User open POS web
#    When User input "admin" as userId and "123" as password
#    And User click button master
#    And User click button user
#    When User input "Pengguna Otomasi" as nama and "otomasi@gmail.com" as email "082272622766" as telp
#    When User input "2131231221" as nik and "Jakarta" as alamat
#    Then User already see new update profile
#
#  Scenario: User see item details otomasi1
#    Given User open POS web
#    When User input "admin" as userId and "123" as password
#    And User click button master
#    And User click button barang
#    And User click detail item "otomasi1"
#    Then User see detail item "otomasi1"
#
#    Scenario: User buy with 1 item, item otomasi1
#    Given User open POS web
#    When User input "admin" as userId and "123" as password
#    And User click transaksi button
#    And User click button transaksi harga jual
#    Then User input cari barang "otomasi1" for the item you are looking for
#    Then User click item "otomasi1" as the item to be purchased
#    Then User input harga bayar as much "1500"
#    And User click button bayar
#
#
#    Scenario: User buy with 2 item, item otomasi1 and item otomasi2
#        Given User open POS web
#        When User input "admin" as userId and "123" as password
#        And User click transaksi button
#        And User click button transaksi harga jual
#        Then User input cari barang "otomasi1" for the item you are looking for
#        Then User click item "otomasi1" as the item to be purchased
#        Then User input cari barang "otomasi2" for the item you are looking for
#        Then User click item "otomasi2" as the item to be purchased
#        Then User input harga bayar as much "4000"
#        And User click button bayar

#      Scenario: User buy with 2 item, item otomasi1 and item otomasi2 and pay more than the transaction amount
#        Given User open POS web
#        When User input "admin" as userId and "123" as password
#        And User click transaksi button
#        And User click button transaksi harga jual
#        Then User input cari barang "otomasi1" for the item you are looking for
#        Then User click item "otomasi1" as the item to be purchased
#        Then User input cari barang "otomasi2" for the item you are looking for
#        Then User click item "otomasi2" as the item to be purchased
#        Then User input harga bayar as much "5000"
#        And User click button bayar

#  Scenario: User edit kategori, merk barang and harga beli in item otomasi1
#    Given User open POS web
#    When User input "admin" as userId and "123" as password
#    And User click button master
#    And User click button barang
#    And User click edit button item "otomasi1"
#    When User edit "kategori otomasi2" as kategori barang and "otomasi1" as nama barang and "baru" as merk barang "500" as harga beli
#    And User click button update data
#    Then User already see new notify update success

#  Scenario: User edit harga jual and stok in item otomasi1
#    Given User open POS web
#    When User input "admin" as userId and "123" as password
#    And User click button master
#    And User click button barang
#    And User click edit button item "otomasi1"
#    When User edit "1500" as harga jual and "PCS" as satuan and "255" as stok
#    And User click button update data
#    Then User already see new notify update success

  Scenario: User edit harga jual and stok in item otomasi1
    Given User open POS web
    When User input "admin" as userId and "123" as password
    And User click setting button
    And User click pengaturan toko button
    When User edit "otomasi store" as nama toko and "jakarta" as alamat toko and "455638" as kontak and "Fazla" as nama pemilik
    And User click button update data
    Then User already see new notify update success

