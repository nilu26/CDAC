const express = require('express')
const bodyParser = require('body-parser')
const cors = require('cors')
const app = express()
const mysql = require('mysql')

const db = mysql.createPool({
    host: 'localhost' ,
    user: 'root' ,
    password: 'root' ,
    database: 'wpt'
})

app.use(cors())
app.use(express.json())

app.use(bodyParser.urlencoded({extended: true}))

app.get('/api/get', (req, res) => {
    const sqlSelect = "SELECT * FROM messages"
    db.query(sqlSelect, (err, result) => {
        res.send(result);
    })
})

app.post('/api/insert', (req,res) => {
    const message = req.body.message;

    const sqlInsert = "INSERT INTO messages (message) VALUES ( ? )"
    db.query(sqlInsert, [message], (err, result) => {
        console.log(result);
    })
})
app.listen(3001, () => {
    console.log("Running on port 3001");
});