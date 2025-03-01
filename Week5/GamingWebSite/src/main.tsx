import React from 'react'
import ReactDOM from 'react-dom/client'
import App from './App.js'
import { ChakraProvider } from '@chakra-ui/react'
import theme from './Theme.js'

ReactDOM.createRoot(document.getElementById('root') as HTMLElement).render(
  <React.StrictMode>
    <ChakraProvider theme={theme}>
      <App />
    </ChakraProvider>
  </React.StrictMode>
)
