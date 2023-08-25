const React = require('react');
const ReactDOM = require('react-dom');
const {createBrowserRouter, RouterProvider} = require('react-router-dom');

const HomePage = require('./pages/home');




const VerBibliotecaPage = require('./pages/ver-biblioteca');

const NuevoIntegrantePage = require('./pages/nuevo-integrante');


const router = createBrowserRouter([
	{ path: '/', element: <HomePage /> },
	
	
	
	
	{ path: '/ver-biblioteca/:id', element: <VerBibliotecaPage /> },
	{ path: '/ver-biblioteca/:id/nuevo-integrante', element: <NuevoIntegrantePage /> },


])


ReactDOM.render(
	<React.StrictMode>
		<RouterProvider router={router} />
	</React.StrictMode>,
	document.getElementById('react'))