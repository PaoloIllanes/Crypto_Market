const express = require('express')
const app = express()

app.get('/news', function (req, res) {
  res.send([
  {
    "publisher" : "Jürgen Ruegenberg Buezo",
    "time" : 15,
    "imageUrl" : "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg",
    "description" : "Pequeña descripccion de la noticia",
    "full" : "Noticia Completa"
  },
  {
    "publisher" : "Otra persona",
    "time" : 30,
    "imageUrl" : "https://i-invdn-com.investing.com/news/LYNXNPEB701AO_S.jpg",
    "description" : "Pequeña descripccion de la noticia",
    "full" : "Noticia Completa"
  },
  {
    "publisher" : "Otra otra persona",
    "time" : 50,
    "imageUrl" : "https://i-invdn-com.investing.com/news/LYNXMPEDAE0PJ-ORUBS_S.jpg",
    "description" : "Pequeña descripccion de la noticia",
    "full" : "Noticia Completa"
  }
])
})

app.get('/trades', function (req, res) {
  res.send([
  {
    "acronym": "BTN",
    "price": 1521,
    "percentage": 12,
    "pricePercentage": 1521.12
  },
  {
    "acronym": "HRC",
    "price": 1521,
    "percentage": 12,
    "pricePercentage": 1521.12
  },
  {
    "acronym": "OBJ",
    "price": 1521,
    "percentage": 12,
    "pricePercentage": 1521.12
  },
  {
    "acronym": "NTF",
    "price": 1521,
    "percentage": 12,
    "pricePercentage": 1521.12
  },
  {
    "acronym": "WPP",
    "price": 1521,
    "percentage": 12,
    "pricePercentage": 1521.12
  },
  {
    "acronym": "FCB",
    "price": 1521,
    "percentage": 12,
    "pricePercentage": 1521.12
  }
])
})

app.get('/trends', function (req, res) {
  res.send([
  {
    "icon": "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/BTC_Logo.svg/1200px-BTC_Logo.svg.png",
    "name": "Bitcoin",
    "desc": "BTN",
    "lastPrice": 15,
    "changes": 0.21,
    "markets": "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg"
  },
  {
    "icon": "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Ethereum_logo_2014.svg/1257px-Ethereum_logo_2014.svg.png",
    "name": "Ethereum",
    "desc": "ETH",
    "lastPrice": 15,
    "changes": 0.21,
    "markets": "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg"
  },
  {
    "icon": "https://www.seekpng.com/png/detail/308-3087811_dogecoin-logo-png-transparent-dogecoin.png",
    "name": "Dogecoin",
    "desc": "DGN",
    "lastPrice": 15,
    "changes": 0.21,
    "markets": "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg"
  },
  {
    "icon": "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/BTC_Logo.svg/1200px-BTC_Logo.svg.png",
    "name": "Bitcoin",
    "desc": "BTN",
    "lastPrice": 15,
    "changes": 0.21,
    "markets": "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg"
  },
  {
    "icon": "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Ethereum_logo_2014.svg/1257px-Ethereum_logo_2014.svg.png",
    "name": "Ethereum",
    "desc": "ETH",
    "lastPrice": 15,
    "changes": 0.21,
    "markets": "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg"
  },
  {
    "icon": "https://www.seekpng.com/png/detail/308-3087811_dogecoin-logo-png-transparent-dogecoin.png",
    "name": "Dogecoin",
    "desc": "DGN",
    "lastPrice": 15,
    "changes": 0.21,
    "markets": "https://i-invdn-com.investing.com/news/LYNXNPEC410B3_S.jpg"
  }
])
})

app.get('/feed', function (req, res) {
  res.send([{
  "coinName":"Bitcoin",
  "shortDescription":"BTC",
  "imageUrl":"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/BTC_Logo.svg/1200px-BTC_Logo.svg.png",
  "price":1500.3
  },
  {
    "coinName":"Ethereum",
    "shortDescription":"ETH",
    "imageUrl":"https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Ethereum_logo_2014.svg/1257px-Ethereum_logo_2014.svg.png",
    "price":200.3
    },
    {
    "coinName":"DOGECOIN",
    "shortDescription":"DOGE",
    "imageUrl":"https://www.seekpng.com/png/detail/308-3087811_dogecoin-logo-png-transparent-dogecoin.png",
    "price":1500.3
    },
    {
        "coinName":"Bitcoin",
        "shortDescription":"BTC",
        "imageUrl":"https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/BTC_Logo.svg/1200px-BTC_Logo.svg.png",
        "price":1500.3
        },
        {
          "coinName":"Ethereum",
          "shortDescription":"ETH",
          "imageUrl":"https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Ethereum_logo_2014.svg/1257px-Ethereum_logo_2014.svg.png",
          "price":200.3
          },
          {
              "coinName":"DOGECOIN",
              "shortDescription":"DOGE",
              "imageUrl":"https://www.seekpng.com/png/detail/308-3087811_dogecoin-logo-png-transparent-dogecoin.png",
              "price":1500.3
              }

])
})

app.get('/wallet', function (req, res) {
  res.send([
  {"coin":{
  "name":
            "Ethereum",
            "id":"ETH",
            "logo_url":"https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Ethereum_logo_2014.svg/1257px-Ethereum_logo_2014.svg.png",
            "price":200.3
  },"qty":3.3
  },
  {"coin":{
    "name":
              "DOGECOIN",
            "id":"DOGE",
            "logo_url":"https://www.seekpng.com/png/detail/308-3087811_dogecoin-logo-png-transparent-dogecoin.png",
            "price":1500.3
    },"qty":50
    }

])
})



app.listen(3000)