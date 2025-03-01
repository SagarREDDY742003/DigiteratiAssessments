import { HStack,Text, Image, SimpleGrid } from '@chakra-ui/react'
import logo from '../assets/logo.png'
import DarkSwitch from './DarkSwitch'
import { Link } from 'react-router-dom'
import SlideBar from './SlideBar'
import React from 'react'
const navBar = () => {
  return (
    <HStack justifyContent={'space-between'} px={'6'}>
      <SimpleGrid display={'flex'} alignItems={'center'} gridTemplateColumns={'auto auto'}>
        <Image src={logo} alt="logo" boxSize={'90px'}/>
        <Link to={'/'}>
          <Text fontSize={'20px'} fontWeight={'bold'}>Gamers Hub</Text>
        </Link>
      </SimpleGrid>

      <SimpleGrid display={'flex'} alignItems={'center'} gridTemplateColumns={'auto auto'} spacing={2}>
        <DarkSwitch/>
        <SlideBar/>
      </SimpleGrid>   
      
    </HStack>
  )
}

export default navBar
