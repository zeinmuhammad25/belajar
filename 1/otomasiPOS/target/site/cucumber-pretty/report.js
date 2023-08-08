$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Regression.feature");
formatter.feature({
  "line": 2,
  "name": "Regression Web Point of Sales",
  "description": "In the following automation test cases are the regression features that exist in the web point of sales",
  "id": "regression-web-point-of-sales",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 6572552900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 6,
      "value": "#  Scenario: User Create new category"
    },
    {
      "line": 7,
      "value": "#    Given User open POS web"
    },
    {
      "line": 8,
      "value": "#    When User input \"admin\" as userId and \"123\" as password"
    },
    {
      "line": 9,
      "value": "#    And User click button master"
    },
    {
      "line": 10,
      "value": "#    And User click button kategori"
    },
    {
      "line": 11,
      "value": "#    When User input \"Kategori1\" as a new kategori"
    },
    {
      "line": 12,
      "value": "#    And User click button insert data"
    },
    {
      "line": 13,
      "value": "#    Then User already see a new category"
    },
    {
      "line": 14,
      "value": "#"
    },
    {
      "line": 15,
      "value": "##    hapus kategori untuk keperluan otomasi"
    },
    {
      "line": 16,
      "value": "#    And delete"
    },
    {
      "line": 17,
      "value": "#"
    },
    {
      "line": 18,
      "value": "#  Scenario: User create new item"
    },
    {
      "line": 19,
      "value": "#    Given User open POS web"
    },
    {
      "line": 20,
      "value": "#    When User input \"admin\" as userId and \"123\" as password"
    },
    {
      "line": 21,
      "value": "#    And User click button master"
    },
    {
      "line": 22,
      "value": "#    And User click button barang"
    },
    {
      "line": 23,
      "value": "#    And User insert data barang"
    },
    {
      "line": 24,
      "value": "#    When User input \"kategori otomasi\" as kategori barang and \"otomasi\" as nama barang and \"sda\" as merk barang \"2500\" as harga beli"
    },
    {
      "line": 25,
      "value": "#    When User input \"3000\" as hargaJual and \"PCS\" as satuan Barang \"3000\" as stok beli"
    },
    {
      "line": 26,
      "value": "#    Then User already see new item in data barang page"
    },
    {
      "line": 27,
      "value": "#"
    },
    {
      "line": 28,
      "value": "#    ##    hapus kategori untuk keperluan otomasi"
    },
    {
      "line": 29,
      "value": "#    And delete"
    },
    {
      "line": 30,
      "value": "#"
    },
    {
      "line": 31,
      "value": "#  Scenario: User edit profil"
    },
    {
      "line": 32,
      "value": "#    Given User open POS web"
    },
    {
      "line": 33,
      "value": "#    When User input \"admin\" as userId and \"123\" as password"
    },
    {
      "line": 34,
      "value": "#    And User click button master"
    },
    {
      "line": 35,
      "value": "#    And User click button user"
    },
    {
      "line": 36,
      "value": "#    When User input \"Pengguna Otomasi\" as nama and \"otomasi@gmail.com\" as email \"082272622766\" as telp"
    },
    {
      "line": 37,
      "value": "#    When User input \"2131231221\" as nik and \"Jakarta\" as alamat"
    },
    {
      "line": 38,
      "value": "#    Then User already see new update profile"
    },
    {
      "line": 39,
      "value": "#"
    },
    {
      "line": 40,
      "value": "#  Scenario: User see item details otomasi1"
    },
    {
      "line": 41,
      "value": "#    Given User open POS web"
    },
    {
      "line": 42,
      "value": "#    When User input \"admin\" as userId and \"123\" as password"
    },
    {
      "line": 43,
      "value": "#    And User click button master"
    },
    {
      "line": 44,
      "value": "#    And User click button barang"
    },
    {
      "line": 45,
      "value": "#    And User click detail item \"otomasi1\""
    },
    {
      "line": 46,
      "value": "#    Then User see detail item \"otomasi1\""
    },
    {
      "line": 47,
      "value": "#"
    },
    {
      "line": 48,
      "value": "#    Scenario: User buy with 1 item, item otomasi1"
    },
    {
      "line": 49,
      "value": "#    Given User open POS web"
    },
    {
      "line": 50,
      "value": "#    When User input \"admin\" as userId and \"123\" as password"
    },
    {
      "line": 51,
      "value": "#    And User click transaksi button"
    },
    {
      "line": 52,
      "value": "#    And User click button transaksi harga jual"
    },
    {
      "line": 53,
      "value": "#    Then User input cari barang \"otomasi1\" for the item you are looking for"
    },
    {
      "line": 54,
      "value": "#    Then User click item \"otomasi1\" as the item to be purchased"
    },
    {
      "line": 55,
      "value": "#    Then User input harga bayar as much \"1500\""
    },
    {
      "line": 56,
      "value": "#    And User click button bayar"
    },
    {
      "line": 57,
      "value": "#"
    },
    {
      "line": 58,
      "value": "#"
    },
    {
      "line": 59,
      "value": "#    Scenario: User buy with 2 item, item otomasi1 and item otomasi2"
    },
    {
      "line": 60,
      "value": "#        Given User open POS web"
    },
    {
      "line": 61,
      "value": "#        When User input \"admin\" as userId and \"123\" as password"
    },
    {
      "line": 62,
      "value": "#        And User click transaksi button"
    },
    {
      "line": 63,
      "value": "#        And User click button transaksi harga jual"
    },
    {
      "line": 64,
      "value": "#        Then User input cari barang \"otomasi1\" for the item you are looking for"
    },
    {
      "line": 65,
      "value": "#        Then User click item \"otomasi1\" as the item to be purchased"
    },
    {
      "line": 66,
      "value": "#        Then User input cari barang \"otomasi2\" for the item you are looking for"
    },
    {
      "line": 67,
      "value": "#        Then User click item \"otomasi2\" as the item to be purchased"
    },
    {
      "line": 68,
      "value": "#        Then User input harga bayar as much \"4000\""
    },
    {
      "line": 69,
      "value": "#        And User click button bayar"
    },
    {
      "line": 71,
      "value": "#      Scenario: User buy with 2 item, item otomasi1 and item otomasi2 and pay more than the transaction amount"
    },
    {
      "line": 72,
      "value": "#        Given User open POS web"
    },
    {
      "line": 73,
      "value": "#        When User input \"admin\" as userId and \"123\" as password"
    },
    {
      "line": 74,
      "value": "#        And User click transaksi button"
    },
    {
      "line": 75,
      "value": "#        And User click button transaksi harga jual"
    },
    {
      "line": 76,
      "value": "#        Then User input cari barang \"otomasi1\" for the item you are looking for"
    },
    {
      "line": 77,
      "value": "#        Then User click item \"otomasi1\" as the item to be purchased"
    },
    {
      "line": 78,
      "value": "#        Then User input cari barang \"otomasi2\" for the item you are looking for"
    },
    {
      "line": 79,
      "value": "#        Then User click item \"otomasi2\" as the item to be purchased"
    },
    {
      "line": 80,
      "value": "#        Then User input harga bayar as much \"5000\""
    },
    {
      "line": 81,
      "value": "#        And User click button bayar"
    },
    {
      "line": 83,
      "value": "#  Scenario: User edit kategori, merk barang and harga beli in item otomasi1"
    },
    {
      "line": 84,
      "value": "#    Given User open POS web"
    },
    {
      "line": 85,
      "value": "#    When User input \"admin\" as userId and \"123\" as password"
    },
    {
      "line": 86,
      "value": "#    And User click button master"
    },
    {
      "line": 87,
      "value": "#    And User click button barang"
    },
    {
      "line": 88,
      "value": "#    And User click edit button item \"otomasi1\""
    },
    {
      "line": 89,
      "value": "#    When User edit \"kategori otomasi2\" as kategori barang and \"otomasi1\" as nama barang and \"baru\" as merk barang \"500\" as harga beli"
    },
    {
      "line": 90,
      "value": "#    And User click button update data"
    },
    {
      "line": 91,
      "value": "#    Then User already see new notify update success"
    },
    {
      "line": 93,
      "value": "#  Scenario: User edit harga jual and stok in item otomasi1"
    },
    {
      "line": 94,
      "value": "#    Given User open POS web"
    },
    {
      "line": 95,
      "value": "#    When User input \"admin\" as userId and \"123\" as password"
    },
    {
      "line": 96,
      "value": "#    And User click button master"
    },
    {
      "line": 97,
      "value": "#    And User click button barang"
    },
    {
      "line": 98,
      "value": "#    And User click edit button item \"otomasi1\""
    },
    {
      "line": 99,
      "value": "#    When User edit \"1500\" as harga jual and \"PCS\" as satuan and \"255\" as stok"
    },
    {
      "line": 100,
      "value": "#    And User click button update data"
    },
    {
      "line": 101,
      "value": "#    Then User already see new notify update success"
    }
  ],
  "line": 103,
  "name": "User edit harga jual and stok in item otomasi1",
  "description": "",
  "id": "regression-web-point-of-sales;user-edit-harga-jual-and-stok-in-item-otomasi1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 104,
  "name": "User open POS web",
  "keyword": "Given "
});
formatter.step({
  "line": 105,
  "name": "User input \"admin\" as userId and \"123\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 106,
  "name": "User click setting button",
  "keyword": "And "
});
formatter.step({
  "line": 107,
  "name": "User click pengaturan toko button",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "User edit \"otomasi store\" as nama toko and \"jakarta\" as alamat toko and \"455638\" as kontak and \"Fazla\" as nama pemilik",
  "keyword": "When "
});
formatter.step({
  "line": 109,
  "name": "User click button update data",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "User already see new notify update success",
  "keyword": "Then "
});
formatter.match({
  "location": "MasterSteps.LoginPage()"
});
formatter.result({
  "duration": 3340134700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 12
    },
    {
      "val": "123",
      "offset": 34
    }
  ],
  "location": "MasterSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 5226579900,
  "status": "passed"
});
formatter.match({
  "location": "SettingSteps.clickSetting()"
});
formatter.result({
  "duration": 4129212900,
  "status": "passed"
});
formatter.match({
  "location": "SettingSteps.clickPengaturanToko()"
});
formatter.result({
  "duration": 6252297200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "otomasi store",
      "offset": 11
    },
    {
      "val": "jakarta",
      "offset": 44
    },
    {
      "val": "455638",
      "offset": 73
    },
    {
      "val": "Fazla",
      "offset": 96
    }
  ],
  "location": "SettingSteps.userEditPengaturan(String,String,String,String)"
});
formatter.result({
  "duration": 5453047000,
  "status": "passed"
});
formatter.match({
  "location": "MasterSteps.buttonUpdateData()"
});
formatter.result({
  "duration": 4143262000,
  "status": "passed"
});
formatter.match({
  "location": "MasterSteps.verifyUpdateData()"
});
formatter.result({
  "duration": 5073938600,
  "status": "passed"
});
formatter.after({
  "duration": 611716400,
  "status": "passed"
});
});