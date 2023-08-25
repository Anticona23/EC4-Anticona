const React = require('react');
const ReactDOM = require('react-dom');
const {createBrowserRouter, RouterProvider} = require('react-router-dom');

const HomePage = require('./pages/home');

const NuevoAutorPage = require('./pages/nuevo-autor');
const VerAutorPage = require('./pages/ver-autor');

const NuevoLibroPage = require('./pages/nuevo-libro');
const VerLibroPage = require('./pages/ver-libro');


const VerBibliotecaPage = require('./pages/ver-biblioteca');

const NuevoIntegrantePage = require('./pages/nuevo-integrante');


const router = createBrowserRouter([
	{ path: '/', element: <HomePage /> },
	{ path: '/ver-libro/:id', element: <VerLibroPage /> },
	{ path: '/nuevo-libro', element: <NuevoLibroPage /> },
	{ path: '/ver-autor/:id', element: <VerAutorPage /> },
	{ path: '/nuevo-autor', element: <NuevoAutorPage /> },
	{ path: '/ver-biblioteca/:id', element: <VerBibliotecaPage /> },
	{ path: '/ver-biblioteca/:id/nuevo-integrante', element: <NuevoIntegrantePage /> },


])


ReactDOM.render(
	<React.StrictMode>
		<RouterProvider router={router} />
	</React.StrictMode>,
	document.getElementById('react'))