import { HStack, Image } from '@chakra-ui/react'
import logo from '../assets/logo.png'
import DarkSwitch from './DarkSwitch'
const navBar = () => {
  return (
    <HStack justifyContent={'space-between'} px={'6'}> 
      <Image src={logo} alt="logo" boxSize={'90px'}/>
      <DarkSwitch/>
    </HStack>
  )
}

export default navBar
