const React = require('react');
const {useState} = require('react');
const { Link } = require('react-router-dom');
const client = require('../client');


const NuevoLibroPage = () => {

    const [nombre, setNombre] = useState('')
    const [fecha, setFecha] = useState('')
    const [editorial, setEditorial] = useState('')

    const handleSubmit = (evento)=>{
        evento.preventDefault();
        client({
            method: 'POST',
            path: '/api/libros',
            entity: {nombre: nombre, fecha: fecha, editorial: editorial},
            headers: {'Content-Type': 'application/json'}
        }).done(()=>{
            window.location = '/';
        })
    }

    return (
        <>
        <h1>Nuevo Libro</h1>
        <form onSubmit={handleSubmit}>
            <label>Nombre</label> <br />
            <input type="text" id='nombre' name='nombre' onChange={e=>setNombre(e.target.value)} /> <br />
            <label>Año</label> <br />
            <input type="text" id='fecha' name='fecha' onChange={e=>setFecha(e.target.value)} /> <br />
            <label>Editorial</label> <br />
            <input type="text" id='editorial' name='editorial' onChange={e=>setEditorial(e.target.value)} /> <br />
            <input type="submit" value="Nuevo Libro" />
        </form>
        <Link to="/">Volver</Link>
        </>
    )
}

module.exports = NuevoLibroPage;