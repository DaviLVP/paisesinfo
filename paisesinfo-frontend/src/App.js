
import React, { useState } from "react";

import './App.css';
import axios from "axios";


function App() {
  const [codigo, setCodigo] = useState("");
  const [data, setData] = useState(null);

  const handleChange = (e) => {
    setCodigo(e.target.value)
  }

  const handleSubmit = async (e) => {
    e.preventDefault();
   try{
    const response = await axios
    .get("http://localhost:8080/paises-info", 
    {
      params: {
        code: codigo,
        localityLanguage: "pt-br" 
      }
    }) 
    setData(response.data);
  } catch (error){
    console.error("erro ao enviar dados", error)
  }
     
  }



  return (
    <div className="Container">
     {data && (
      <>
      <h1>{data.nome}</h1>
      <h2>{data.isoLinguagensNativas[0].isoNome}</h2>
      <h3>{data.moeda.nome}</h3>
      <h4>{data.emojiBandeira}</h4>
      </>
)}
  


      <form onSubmit={handleSubmit}>
        <label>
          Código
          <input type="text" name="codigo" value={codigo} onChange={handleChange} />
        </label>

        <button type = "submit">Enviar</button>
      </form>
    </div>
  );
}

export default App;
