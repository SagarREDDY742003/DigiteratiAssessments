// import ButtonComponent from "./components/ButtonComponent"
import NavBar from "./components/navBar"
import { Grid, GridItem } from '@chakra-ui/react'
import GamingCard from "./components/GameCard"
function App() {

  return (
    <>
      <Grid templateAreas={`"nav nav" "aside main"`} >
        <GridItem area={'nav'}  bg={"teal"} >
          <NavBar />
        </GridItem>
      </Grid>  
      <GamingCard />
      
    </>
    
  )
}

export default App
