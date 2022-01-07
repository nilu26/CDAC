import './App.css';
import React, { useState, useEffect } from 'react';
import Axios from 'axios';
//import { response } from 'express';

function App() {


    //const [message, setMessage] = useState('')
    const [username, setUsername] = useState('')
    const [usernameList, setUsernameList] = useState([])
    const [usernamesList, setUsernamesList] = useState()
    //const [messageList, setMessageList] = useState([])

    useEffect( () => {
      Axios.get('http://localhost:3001/api/get').then ((response) => {
        setUsernameList (response.data)
      });
    }, [] )
    const submitForm = () => {
      Axios.post('http://localhost:3001/api/insert',
      { username: username } );
      setUsernameList([...usernameList, { username: username }])
      setUsernamesList([usernamesList, { username: username }])
      var name=document.getElementById("name").value;
    if(name=='')
    alert("enter message");
    } 
    
    return (
      
    <div className="App">
      <div className= "heading">
      <h1 id='title'>MyChatAPP</h1>
      {usernameList.map((value) => {
        return <h5> {value.uid}, {value.username} </h5>
      })}
      </div>
      <div className= "output">
      <input type="text" id="name" name="message"  onChange={ (e) => {
        setUsername (e.target.value);
      }} />
      <button onClick={submitForm}> Send </button>
      </div>
      <div className="msg">
      {usernameList.map((val) => {
        return <h1> {val.username} </h1>
      })}
      </div>
    </div>
  );
}

export default App;
